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

package org.tensorflow.op.data.experimental;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TString;
import org.tensorflow.types.family.TType;

/**
 */
public final class MatchingFilesDataset extends RawOp implements Operand<TType> {
  
  /**
   * Factory method to create a class wrapping a new MatchingFilesDataset operation.
   * 
   * @param scope current scope
   * @param patterns 
   * @return a new instance of MatchingFilesDataset
   */
  @Endpoint(describeByClass = true)
  public static MatchingFilesDataset create(Scope scope, Operand<TString> patterns) {
    OperationBuilder opBuilder = scope.env().opBuilder("ExperimentalMatchingFilesDataset", scope.makeOpName("MatchingFilesDataset"));
    opBuilder.addInput(patterns.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new MatchingFilesDataset(opBuilder.build());
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }
  
  private Output<?> handle;
  
  private MatchingFilesDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
