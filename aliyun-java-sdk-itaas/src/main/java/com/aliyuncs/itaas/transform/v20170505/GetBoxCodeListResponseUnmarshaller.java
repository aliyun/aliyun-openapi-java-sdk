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

import com.aliyuncs.itaas.model.v20170505.GetBoxCodeListResponse;
import com.aliyuncs.itaas.model.v20170505.GetBoxCodeListResponse.BoxCodeInfo;
import com.aliyuncs.itaas.model.v20170505.GetBoxCodeListResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBoxCodeListResponseUnmarshaller {

	public static GetBoxCodeListResponse unmarshall(GetBoxCodeListResponse getBoxCodeListResponse, UnmarshallerContext context) {
		
		getBoxCodeListResponse.setRequestId(context.stringValue("GetBoxCodeListResponse.RequestId"));
		getBoxCodeListResponse.setErrorCode(context.integerValue("GetBoxCodeListResponse.ErrorCode"));
		getBoxCodeListResponse.setErrorMsg(context.stringValue("GetBoxCodeListResponse.ErrorMsg"));
		getBoxCodeListResponse.setSuccess(context.booleanValue("GetBoxCodeListResponse.Success"));

		List<BoxCodeInfo> data = new ArrayList<BoxCodeInfo>();
		for (int i = 0; i < context.lengthValue("GetBoxCodeListResponse.Data.Length"); i++) {
			BoxCodeInfo boxCodeInfo = new BoxCodeInfo();
			boxCodeInfo.setBeginTime(context.longValue("GetBoxCodeListResponse.Data["+ i +"].BeginTime"));
			boxCodeInfo.setBoxInfo(context.stringValue("GetBoxCodeListResponse.Data["+ i +"].BoxInfo"));
			boxCodeInfo.setCode(context.stringValue("GetBoxCodeListResponse.Data["+ i +"].Code"));
			boxCodeInfo.setEndTime(context.longValue("GetBoxCodeListResponse.Data["+ i +"].EndTime"));
			boxCodeInfo.setModifyTime(context.longValue("GetBoxCodeListResponse.Data["+ i +"].ModifyTime"));
			boxCodeInfo.setOperator(context.stringValue("GetBoxCodeListResponse.Data["+ i +"].Operator"));
			boxCodeInfo.setScreencode(context.stringValue("GetBoxCodeListResponse.Data["+ i +"].Screencode"));
			boxCodeInfo.setStatus(context.integerValue("GetBoxCodeListResponse.Data["+ i +"].Status"));
			boxCodeInfo.setStatusTxt(context.stringValue("GetBoxCodeListResponse.Data["+ i +"].StatusTxt"));

			data.add(boxCodeInfo);
		}
		getBoxCodeListResponse.setData(data);

		List<ErrorMessage> errorList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetBoxCodeListResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetBoxCodeListResponse.ErrorList["+ i +"].ErrorMessage"));

			errorList.add(errorMessage);
		}
		getBoxCodeListResponse.setErrorList(errorList);
	 
	 	return getBoxCodeListResponse;
	}
}