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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.GetConnectionPoolIpOperationResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConnectionPoolIpOperationResultResponseUnmarshaller {

	public static GetConnectionPoolIpOperationResultResponse unmarshall(GetConnectionPoolIpOperationResultResponse getConnectionPoolIpOperationResultResponse, UnmarshallerContext _ctx) {
		
		getConnectionPoolIpOperationResultResponse.setRequestId(_ctx.stringValue("GetConnectionPoolIpOperationResultResponse.RequestId"));

		List<String> resultFilePaths = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConnectionPoolIpOperationResultResponse.ResultFilePaths.Length"); i++) {
			resultFilePaths.add(_ctx.stringValue("GetConnectionPoolIpOperationResultResponse.ResultFilePaths["+ i +"]"));
		}
		getConnectionPoolIpOperationResultResponse.setResultFilePaths(resultFilePaths);
	 
	 	return getConnectionPoolIpOperationResultResponse;
	}
}