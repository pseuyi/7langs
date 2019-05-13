Burrito := Object clone

Burrito description := "tasty food"
Burrito eat :=  method("eating burrito..." println)
Burrito filling := list("rice", "beans")

breakfast := Burrito clone
breakfast filling append("eggs")

"Is a breakfast burrito a burrito?" println
(breakfast type == Burrito type) println
"Ok then..."
breakfast eat

