{:parts {:cpu35176 {:children nil, :color :blue, :pins {:button35174 {:x 110, :trigger true, :value 0}, :chip35173 {:x 330, :trigger false, :value 0}, :chip35177 {:x 410, :trigger false, :value 0}, :probe35182 {:x 220, :trigger false, :value 1}}, :scale [0.3 0.07 0.3], :gates {:gate-and35178 {:type :and, :x 220, :y 100, :tab 0}, :gate-not35184 {:type :not, :x 220, :y 50, :tab 1}, :gate-and35185 {:type :and, :x 220, :y 100, :tab 1}}, :value 0, :type :cpu, :layer 1, :connections {:connection35179 {:points [:button35174 [110 100] :gate-and35178], :tab 0}, :connection35180 {:points [:gate-and35178 [330 100] :chip35173], :tab 0}, :connection35183 {:points [:probe35182 :gate-and35178], :tab 0}, :connection35186 {:points [:button35174 [110 100] :gate-and35185], :tab 1}, :connection35187 {:points [:probe35182 :gate-not35184], :tab 1}, :connection35188 {:points [:gate-not35184 :gate-and35185], :tab 1}, :connection35189 {:points [:gate-and35185 [410 100] :chip35177], :tab 1}}, :tab 1}, :probe35181 {:type :probe, :color :purple, :value 1, :layer 1, :scale [0.1 0.1 0.1], :children nil}, :probe35182 {:type :probe, :color :purple, :value 1, :layer 1, :scale [0.1 0.1 0.1], :children nil}, :block35168 {:type :block, :color :white, :value 0, :layer 1, :scale (1.0 1.0 0.5), :children {:track35170 {:position [0.3 0.3 0.35000002], :rotation [1.0 0.0 0.0 90.00000250447816]}, :chip35173 {:position [0.25 0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :button35174 {:position [-0.25 0.6 0.0], :rotation [0.0 1.0 0.0 0.0]}, :cpu35176 {:position [-0.25 0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :chip35177 {:position [0.25 -0.25 -0.28500003], :rotation [-1.0 0.0 0.0 90.00000250447816]}, :probe35181 {:position [0.45 0.19999999 0.3], :rotation [1.0 0.0 0.0 90.00000250447816]}}}, :track35191 {:type :track, :color :red, :value 0, :layer 1, :scale [0.1 0.1 0.1], :children nil}, :ground-part {:type :ground, :color :dark-gray, :scale [12 0.2 12], :children {:block35168 {:position [-1.0 0.6 -0.25], :rotation [0.0 1.0 0.0 0.0]}, :block35190 {:position [-1.0 0.6 1.75], :rotation [0.0 1.0 0.0 0.0]}}, :pins nil, :connections nil, :functions nil}, :block35190 {:type :block, :color :white, :value 0, :layer 2, :scale (1.0 1.0 0.5), :children nil}, :chip35173 {:children nil, :color :dark-gray, :scale [0.3 0.07 0.3], :value 0, :time 1.0, :functions {:track35170 {:points [[0 0] [1.0 0.15]], :relative false, :final-points [[0 0] [1.0 0.15]]}}, :type :chip, :layer 1, :view {:offset [0.025 0.1], :zoom 0.5}, :final-time 1.0}, :button35174 {:type :button, :color :red, :value 0, :layer 1, :scale [0.5 0.2 0.5], :children nil}, :block35171 {:type :block, :color [0 0 255], :value 0, :layer 1, :scale (2.6 1.3 0.1), :children {:probe35182 {:position [-0.9 -0.6000001 0.100000024], :rotation [1.0 0.0 0.0 90.00000250447816]}, :track35191 {:position [-1.0500003 0.7500001 0.0], :rotation [0.0 1.0 0.0 0.0]}}}, :track35170 {:type :track, :color :red, :value 0.0, :layer 1, :scale [0.1 0.1 0.1], :children {:block35171 {:position [1.05 0.65 0.0], :rotation [0.0 1.0 0.0 0.0]}}}, :chip35177 {:children nil, :color :dark-gray, :scale [0.3 0.07 0.3], :value 0, :time 1, :functions {:track35170 {:points [[0 0.15] [1 0.0]], :relative false, :final-points [[0 0.15] [1 0.0]]}}, :type :chip, :layer 1, :view {:offset [0.025 0.1], :zoom 0.5}, :final-time 1}}, :camera {:vector [0 0 1], :distance 57.7793153284182, :x-angle 38.99999999999993, :y-angle -516.9999999999999, :pivot [0.8800786724298248 0.49999999999999956 -0.02912918459402225], :eye [18.425046323797012 36.86170196533203 -41.36252609621511]}, :visible-layers [1 2]}