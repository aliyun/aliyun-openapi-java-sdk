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

import com.aliyuncs.emr.model.v20160408.GetUserOutputStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetUserOutputStatisticInfoResponse.ClusterStatUserOutput;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserOutputStatisticInfoResponseUnmarshaller {

	public static GetUserOutputStatisticInfoResponse unmarshall(GetUserOutputStatisticInfoResponse getUserOutputStatisticInfoResponse, UnmarshallerContext context) {
		
		getUserOutputStatisticInfoResponse.setRequestId(context.stringValue("GetUserOutputStatisticInfoResponse.RequestId"));

		List<ClusterStatUserOutput> userOutputList = new ArrayList<ClusterStatUserOutput>();
		for (int i = 0; i < context.lengthValue("GetUserOutputStatisticInfoResponse.UserOutputList.Length"); i++) {
			ClusterStatUserOutput clusterStatUserOutput = new ClusterStatUserOutput();
			clusterStatUserOutput.setUser(context.stringValue("GetUserOutputStatisticInfoResponse.UserOutputList["+ i +"].User"));
			clusterStatUserOutput.setBytesOutput(context.longValue("GetUserOutputStatisticInfoResponse.UserOutputList["+ i +"].BytesOutput"));

			userOutputList.add(clusterStatUserOutput);
		}
		getUserOutputStatisticInfoResponse.setUserOutputList(userOutputList);
	 
	 	return getUserOutputStatisticInfoResponse;
	}
}