# day two

ary = Array.new(16) { |i| rand(10) }
ary.each { |v| p "#{v},#{v-1},#{v-2},#{v-3}" if (v % 4 == 0) } 
