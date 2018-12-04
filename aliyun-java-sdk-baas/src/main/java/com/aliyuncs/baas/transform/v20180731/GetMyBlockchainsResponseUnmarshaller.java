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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.GetMyBlockchainsResponse;
import com.aliyuncs.baas.model.v20180731.GetMyBlockchainsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMyBlockchainsResponseUnmarshaller {

	public static GetMyBlockchainsResponse unmarshall(GetMyBlockchainsResponse getMyBlockchainsResponse, UnmarshallerContext context) {
		
		getMyBlockchainsResponse.setRequestId(context.stringValue("GetMyBlockchainsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("GetMyBlockchainsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(context.integerValue("GetMyBlockchainsResponse.Result["+ i +"].Id"));
			resultItem.setBizid(context.stringValue("GetMyBlockchainsResponse.Result["+ i +"].Bizid"));
			resultItem.setUsername(context.stringValue("GetMyBlockchainsResponse.Result["+ i +"].Username"));
			resultItem.setReqAddr(context.stringValue("GetMyBlockchainsResponse.Result["+ i +"].ReqAddr"));
			resultItem.setSignedAddr(context.stringValue("GetMyBlockchainsResponse.Result["+ i +"].SignedAddr"));
			resultItem.setStatus(context.integerValue("GetMyBlockchainsResponse.Result["+ i +"].Status"));
			resultItem.setRejectReason(context.stringValue("GetMyBlockchainsResponse.Result["+ i +"].RejectReason"));
			resultItem.setCreatetime(context.longValue("GetMyBlockchainsResponse.Result["+ i +"].Createtime"));
			resultItem.setUpdatetime(context.longValue("GetMyBlockchainsResponse.Result["+ i +"].Updatetime"));

			result.add(resultItem);
		}
		getMyBlockchainsResponse.setResult(result);
	 
	 	return getMyBlockchainsResponse;
	}
}