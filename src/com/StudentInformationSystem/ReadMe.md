# Öğrenci Not Sistemi

### Course Sınıfı Özellikleri

- Nitelikler : name, code, prefix, grade, Teacher
- Metotlar : Course(), addTeacher(), printTeacher()

### Teacher Sınıfı Özellikleri

- Nitelikler : name, mpno, branch
- Metotlar : Teacher()

### Student Sınıfı Özellikleri

- Nitelikler : name, stuNo, classes, course1, course2, course3, average, isPass
- Metotlar : Student(), addBulkExamNote(), isPass(), calcAverage(), printGrade()

## Ödev

Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

