/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.io;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TInt32;
import org.tensorflow.types.TString;

/**
 * Generate a glob pattern matching all sharded file names.
 */
@Operator(group = "io")
public final class ShardedFilespec extends RawOp implements Operand<TString> {
  
  /**
   * Factory method to create a class wrapping a new ShardedFilespec operation.
   * 
   * @param scope current scope
   * @param basename 
   * @param numShards 
   * @return a new instance of ShardedFilespec
   */
  @Endpoint(describeByClass = true)
  public static ShardedFilespec create(Scope scope, Operand<TString> basename, Operand<TInt32> numShards) {
    OperationBuilder opBuilder = scope.env().opBuilder("ShardedFilespec", scope.makeOpName("ShardedFilespec"));
    opBuilder.addInput(basename.asOutput());
    opBuilder.addInput(numShards.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ShardedFilespec(opBuilder.build());
  }
  
  /**
   */
  public Output<TString> filename() {
    return filename;
  }
  
  @Override
  public Output<TString> asOutput() {
    return filename;
  }
  
  private Output<TString> filename;
  
  private ShardedFilespec(Operation operation) {
    super(operation);
    int outputIdx = 0;
    filename = operation.output(outputIdx++);
  }
}
