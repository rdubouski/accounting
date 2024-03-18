window.addEventListener('DOMContentLoaded', () => {
    var table = document.getElementById('tableId');

    for (var i = 1, len = table.rows.length; i < len; i++) {
        var row = table.rows[i],
        date = new Date(row.cells[6].innerHTML),
        curdate = new Date(),
        month = date.getMonth() + 1,
        year = date.getFullYear(),
        curmonth = curdate.getMonth() + 1,
        curyear = curdate.getFullYear();

        if (year < curyear) {
            row.style['background-color'] = 'red';
        } else if (month <= curmonth && year === curyear) {
            row.style['background-color'] = 'red';
        } else if ((month - curmonth === 1) && year === curyear) {
            row.style['background-color'] = 'yellow';
        } else {
            row.style['background-color'] = '';
        }
    }
})


