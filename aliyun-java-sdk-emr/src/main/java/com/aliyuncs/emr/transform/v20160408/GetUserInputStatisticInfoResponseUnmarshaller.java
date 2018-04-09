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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetUserInputStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetUserInputStatisticInfoResponse.ClusterStatUserInput;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInputStatisticInfoResponseUnmarshaller {

	public static GetUserInputStatisticInfoResponse unmarshall(GetUserInputStatisticInfoResponse getUserInputStatisticInfoResponse, UnmarshallerContext context) {
		
		getUserInputStatisticInfoResponse.setRequestId(context.stringValue("GetUserInputStatisticInfoResponse.RequestId"));

		List<ClusterStatUserInput> userInputList = new ArrayList<ClusterStatUserInput>();
		for (int i = 0; i < context.lengthValue("GetUserInputStatisticInfoResponse.UserInputList.Length"); i++) {
			ClusterStatUserInput clusterStatUserInput = new ClusterStatUserInput();
			clusterStatUserInput.setUser(context.stringValue("GetUserInputStatisticInfoResponse.UserInputList["+ i +"].User"));
			clusterStatUserInput.setBytesInput(context.longValue("GetUserInputStatisticInfoResponse.UserInputList["+ i +"].BytesInput"));

			userInputList.add(clusterStatUserInput);
		}
		getUserInputStatisticInfoResponse.setUserInputList(userInputList);
	 
	 	return getUserInputStatisticInfoResponse;
	}
}