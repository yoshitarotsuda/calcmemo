# 絶対値
-10.abs #=> 10

# バイナリーサーチ
def binary_search(array, right, target)
  left = 0
  while left <= right
    center = (left + right) / 2
    if array[center] == target
      return center
    elsif array[center] < target
      left = center + 1
    else
      right = center - 1
    end
  end
  return -1 
end

# map挙動確認

a = gets.split(" ")
a = a.map { |b| b * 3}
a.each do |x|
  puts x
end

# 選択式コード

while true
  puts 'ボタンを選択してください'
  puts '[1]'
  puts '[2]'
  puts '[3]'
  input = gets.to_i
  if input == 1
    
  elsif input == 2
    
  elsif input == 3
    exit
  else
    puts '無効な値です'
  end
end