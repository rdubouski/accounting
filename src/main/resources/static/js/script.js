window.addEventListener('DOMContentLoaded', () => {
    var table = document.getElementById('tableId');

    for (var i = 1, len = table.rows.length; i < len; i++) {
        var row = table.rows[i],
        date = new Date(row.cells[5].innerHTML), // предполагаем, что дата зарядки находится в 6-м столбце каждой строки (index starts at 0)
        curdate = new Date(),
        month = date.getMonth() + 1, // месяцы начинаются с 0
        year = date.getFullYear();
        curmonth = curdate.getMonth() + 1, // месяцы начинаются с 0
        curyear = curdate.getFullYear();

        if (month <= curmonth && year <= curyear) { // если месяц - февраль 2023, строка окрашивается в красный
            row.style['background-color'] = 'red';
        } else if (month < 8 && month > 4) { // или если месяц в промежутке с мая по август
            row.style['background-color'] = 'yellow';
        } else {
            row.style['background-color'] = ''; // в противном случае стиль не меняется
        }
    }
})


