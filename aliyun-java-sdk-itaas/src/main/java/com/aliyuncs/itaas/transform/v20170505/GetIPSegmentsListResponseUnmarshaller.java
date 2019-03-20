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

package com.aliyuncs.itaas.transform.v20170505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itaas.model.v20170505.GetIPSegmentsListResponse;
import com.aliyuncs.itaas.model.v20170505.GetIPSegmentsListResponse.ErrorMessage;
import com.aliyuncs.itaas.model.v20170505.GetIPSegmentsListResponse.IpsegmentInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIPSegmentsListResponseUnmarshaller {

	public static GetIPSegmentsListResponse unmarshall(GetIPSegmentsListResponse getIPSegmentsListResponse, UnmarshallerContext context) {
		
		getIPSegmentsListResponse.setRequestId(context.stringValue("GetIPSegmentsListResponse.RequestId"));
		getIPSegmentsListResponse.setErrorCode(context.integerValue("GetIPSegmentsListResponse.ErrorCode"));
		getIPSegmentsListResponse.setErrorMsg(context.stringValue("GetIPSegmentsListResponse.ErrorMsg"));
		getIPSegmentsListResponse.setSuccess(context.booleanValue("GetIPSegmentsListResponse.Success"));

		List<IpsegmentInfo> data = new ArrayList<IpsegmentInfo>();
		for (int i = 0; i < context.lengthValue("GetIPSegmentsListResponse.Data.Length"); i++) {
			IpsegmentInfo ipsegmentInfo = new IpsegmentInfo();
			ipsegmentInfo.setCreateTimeL(context.longValue("GetIPSegmentsListResponse.Data["+ i +"].CreateTimeL"));
			ipsegmentInfo.setIpsegment(context.stringValue("GetIPSegmentsListResponse.Data["+ i +"].Ipsegment"));
			ipsegmentInfo.setMemo(context.stringValue("GetIPSegmentsListResponse.Data["+ i +"].Memo"));
			ipsegmentInfo.setModifyTimeL(context.longValue("GetIPSegmentsListResponse.Data["+ i +"].ModifyTimeL"));
			ipsegmentInfo.setUuid(context.stringValue("GetIPSegmentsListResponse.Data["+ i +"].Uuid"));

			data.add(ipsegmentInfo);
		}
		getIPSegmentsListResponse.setData(data);

		List<ErrorMessage> errorList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetIPSegmentsListResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetIPSegmentsListResponse.ErrorList["+ i +"].ErrorMessage"));

			errorList.add(errorMessage);
		}
		getIPSegmentsListResponse.setErrorList(errorList);
	 
	 	return getIPSegmentsListResponse;
	}
}