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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.UpdateNumberStatusResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.UpdateNumberStatusResponse.UpdateNumberStatusResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNumberStatusResponseUnmarshaller {

	public static UpdateNumberStatusResponse unmarshall(UpdateNumberStatusResponse updateNumberStatusResponse, UnmarshallerContext context) {
		
		updateNumberStatusResponse.setRequestId(context.stringValue("UpdateNumberStatusResponse.RequestId"));
		updateNumberStatusResponse.setSuccess(context.booleanValue("UpdateNumberStatusResponse.Success"));
		updateNumberStatusResponse.setCode(context.stringValue("UpdateNumberStatusResponse.Code"));
		updateNumberStatusResponse.setMessage(context.stringValue("UpdateNumberStatusResponse.Message"));
		updateNumberStatusResponse.setHttpStatusCode(context.integerValue("UpdateNumberStatusResponse.HttpStatusCode"));

		List<UpdateNumberStatusResult> resultList = new ArrayList<UpdateNumberStatusResult>();
		for (int i = 0; i < context.lengthValue("UpdateNumberStatusResponse.resultList.Length"); i++) {
			UpdateNumberStatusResult updateNumberStatusResult = new UpdateNumberStatusResult();
			updateNumberStatusResult.setNumber(context.stringValue("UpdateNumberStatusResponse.resultList["+ i +"].Number"));
			updateNumberStatusResult.setStatus(context.stringValue("UpdateNumberStatusResponse.resultList["+ i +"].Status"));
			updateNumberStatusResult.setResult(context.integerValue("UpdateNumberStatusResponse.resultList["+ i +"].result"));
			updateNumberStatusResult.setResultMsg(context.stringValue("UpdateNumberStatusResponse.resultList["+ i +"].resultMsg"));

			resultList.add(updateNumberStatusResult);
		}
		updateNumberStatusResponse.setResultList(resultList);
	 
	 	return updateNumberStatusResponse;
	}
}