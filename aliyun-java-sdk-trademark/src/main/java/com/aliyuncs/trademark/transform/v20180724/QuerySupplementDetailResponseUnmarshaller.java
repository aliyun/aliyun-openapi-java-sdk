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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QuerySupplementDetailResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySupplementDetailResponseUnmarshaller {

	public static QuerySupplementDetailResponse unmarshall(QuerySupplementDetailResponse querySupplementDetailResponse, UnmarshallerContext context) {
		
		querySupplementDetailResponse.setRequestId(context.stringValue("QuerySupplementDetailResponse.RequestId"));
		querySupplementDetailResponse.setId(context.longValue("QuerySupplementDetailResponse.Id"));
		querySupplementDetailResponse.setSerialNumber(context.stringValue("QuerySupplementDetailResponse.SerialNumber"));
		querySupplementDetailResponse.setType(context.integerValue("QuerySupplementDetailResponse.Type"));
		querySupplementDetailResponse.setStatus(context.integerValue("QuerySupplementDetailResponse.Status"));
		querySupplementDetailResponse.setOrderId(context.stringValue("QuerySupplementDetailResponse.OrderId"));
		querySupplementDetailResponse.setTmNumber(context.stringValue("QuerySupplementDetailResponse.TmNumber"));
		querySupplementDetailResponse.setSendTime(context.longValue("QuerySupplementDetailResponse.SendTime"));
		querySupplementDetailResponse.setAcceptTime(context.longValue("QuerySupplementDetailResponse.AcceptTime"));
		querySupplementDetailResponse.setSbjDeadTime(context.longValue("QuerySupplementDetailResponse.SbjDeadTime"));
		querySupplementDetailResponse.setAcceptDeadTime(context.longValue("QuerySupplementDetailResponse.AcceptDeadTime"));
		querySupplementDetailResponse.setOperateTime(context.longValue("QuerySupplementDetailResponse.OperateTime"));
		querySupplementDetailResponse.setUploadFileTemplateUrl(context.stringValue("QuerySupplementDetailResponse.UploadFileTemplateUrl"));
		querySupplementDetailResponse.setContent(context.stringValue("QuerySupplementDetailResponse.Content"));
		querySupplementDetailResponse.setBatchNum(context.stringValue("QuerySupplementDetailResponse.BatchNum"));

		List<String> fileTemplateUrls = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QuerySupplementDetailResponse.FileTemplateUrls.Length"); i++) {
			fileTemplateUrls.add(context.stringValue("QuerySupplementDetailResponse.FileTemplateUrls["+ i +"]"));
		}
		querySupplementDetailResponse.setFileTemplateUrls(fileTemplateUrls);
	 
	 	return querySupplementDetailResponse;
	}
}