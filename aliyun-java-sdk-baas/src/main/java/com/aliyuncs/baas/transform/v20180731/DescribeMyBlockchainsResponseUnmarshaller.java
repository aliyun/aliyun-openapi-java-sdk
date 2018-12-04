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

import com.aliyuncs.baas.model.v20180731.DescribeMyBlockchainsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeMyBlockchainsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMyBlockchainsResponseUnmarshaller {

	public static DescribeMyBlockchainsResponse unmarshall(DescribeMyBlockchainsResponse describeMyBlockchainsResponse, UnmarshallerContext context) {
		
		describeMyBlockchainsResponse.setRequestId(context.stringValue("DescribeMyBlockchainsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeMyBlockchainsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(context.integerValue("DescribeMyBlockchainsResponse.Result["+ i +"].Id"));
			resultItem.setBizid(context.stringValue("DescribeMyBlockchainsResponse.Result["+ i +"].Bizid"));
			resultItem.setUsername(context.stringValue("DescribeMyBlockchainsResponse.Result["+ i +"].Username"));
			resultItem.setReqAddr(context.stringValue("DescribeMyBlockchainsResponse.Result["+ i +"].ReqAddr"));
			resultItem.setSignedAddr(context.stringValue("DescribeMyBlockchainsResponse.Result["+ i +"].SignedAddr"));
			resultItem.setStatus(context.integerValue("DescribeMyBlockchainsResponse.Result["+ i +"].Status"));
			resultItem.setRejectReason(context.stringValue("DescribeMyBlockchainsResponse.Result["+ i +"].RejectReason"));
			resultItem.setCreatetime(context.longValue("DescribeMyBlockchainsResponse.Result["+ i +"].Createtime"));
			resultItem.setUpdatetime(context.longValue("DescribeMyBlockchainsResponse.Result["+ i +"].Updatetime"));

			result.add(resultItem);
		}
		describeMyBlockchainsResponse.setResult(result);
	 
	 	return describeMyBlockchainsResponse;
	}
}