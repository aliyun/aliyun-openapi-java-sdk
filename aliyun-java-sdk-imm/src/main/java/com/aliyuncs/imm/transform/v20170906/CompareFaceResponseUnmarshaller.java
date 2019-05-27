/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.CompareFaceResponse;
import com.aliyuncs.imm.model.v20170906.CompareFaceResponse.CompareResultItem;
import com.aliyuncs.imm.model.v20170906.CompareFaceResponse.CompareResultItem.FaceA;
import com.aliyuncs.imm.model.v20170906.CompareFaceResponse.CompareResultItem.FaceB;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareFaceResponseUnmarshaller {

	public static CompareFaceResponse unmarshall(CompareFaceResponse compareFaceResponse, UnmarshallerContext context) {
		
		compareFaceResponse.setRequestId(context.stringValue("CompareFaceResponse.RequestId"));

		List<CompareResultItem> compareResult = new ArrayList<CompareResultItem>();
		for (int i = 0; i < context.lengthValue("CompareFaceResponse.CompareResult.Length"); i++) {
			CompareResultItem compareResultItem = new CompareResultItem();
			compareResultItem.setSimilarity(context.floatValue("CompareFaceResponse.CompareResult["+ i +"].Similarity"));

			FaceA faceA = new FaceA();
			faceA.setImageUri(context.stringValue("CompareFaceResponse.CompareResult["+ i +"].FaceA.ImageUri"));

			List<String> axis = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("CompareFaceResponse.CompareResult["+ i +"].FaceA.Axis.Length"); j++) {
				axis.add(context.stringValue("CompareFaceResponse.CompareResult["+ i +"].FaceA.Axis["+ j +"]"));
			}
			faceA.setAxis(axis);
			compareResultItem.setFaceA(faceA);

			FaceB faceB = new FaceB();
			faceB.setImageUri(context.stringValue("CompareFaceResponse.CompareResult["+ i +"].FaceB.ImageUri"));

			List<String> axis1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("CompareFaceResponse.CompareResult["+ i +"].FaceB.Axis.Length"); j++) {
				axis1.add(context.stringValue("CompareFaceResponse.CompareResult["+ i +"].FaceB.Axis["+ j +"]"));
			}
			faceB.setAxis1(axis1);
			compareResultItem.setFaceB(faceB);

			compareResult.add(compareResultItem);
		}
		compareFaceResponse.setCompareResult(compareResult);
	 
	 	return compareFaceResponse;
	}
}