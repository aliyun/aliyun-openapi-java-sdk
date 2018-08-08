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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamPushErrorsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamPushErrorsResponse.PushErrorsModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamPushErrorsResponseUnmarshaller {

	public static DescribeLiveStreamPushErrorsResponse unmarshall(DescribeLiveStreamPushErrorsResponse describeLiveStreamPushErrorsResponse, UnmarshallerContext context) {
		
		describeLiveStreamPushErrorsResponse.setRequestId(context.stringValue("DescribeLiveStreamPushErrorsResponse.RequestId"));

		List<PushErrorsModel> pushErrorsModelList = new ArrayList<PushErrorsModel>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamPushErrorsResponse.PushErrorsModelList.Length"); i++) {
			PushErrorsModel pushErrorsModel = new PushErrorsModel();
			pushErrorsModel.setErrorCode(context.stringValue("DescribeLiveStreamPushErrorsResponse.PushErrorsModelList["+ i +"].ErrorCode"));

			pushErrorsModelList.add(pushErrorsModel);
		}
		describeLiveStreamPushErrorsResponse.setPushErrorsModelList(pushErrorsModelList);
	 
	 	return describeLiveStreamPushErrorsResponse;
	}
}