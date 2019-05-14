
# guess random number

def guess_num
  target = rand(10)
  guess = nil

  while target != guess
    puts "guess a random number"
    guess = gets.strip.to_i

    puts "guess is too high" if guess > target
    puts "guess is too low" if guess < target
  end

  puts "guessed correctly: #{target}"
end

guess_num()
