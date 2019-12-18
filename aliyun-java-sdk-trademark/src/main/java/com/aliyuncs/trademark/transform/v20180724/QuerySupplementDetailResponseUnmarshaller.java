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
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySupplementDetailResponseUnmarshaller {

	public static QuerySupplementDetailResponse unmarshall(QuerySupplementDetailResponse querySupplementDetailResponse, UnmarshallerContext _ctx) {
		
		querySupplementDetailResponse.setRequestId(_ctx.stringValue("QuerySupplementDetailResponse.RequestId"));
		querySupplementDetailResponse.setId(_ctx.longValue("QuerySupplementDetailResponse.Id"));
		querySupplementDetailResponse.setSerialNumber(_ctx.stringValue("QuerySupplementDetailResponse.SerialNumber"));
		querySupplementDetailResponse.setType(_ctx.integerValue("QuerySupplementDetailResponse.Type"));
		querySupplementDetailResponse.setStatus(_ctx.integerValue("QuerySupplementDetailResponse.Status"));
		querySupplementDetailResponse.setTmNumber(_ctx.stringValue("QuerySupplementDetailResponse.TmNumber"));
		querySupplementDetailResponse.setSendTime(_ctx.longValue("QuerySupplementDetailResponse.SendTime"));
		querySupplementDetailResponse.setAcceptTime(_ctx.longValue("QuerySupplementDetailResponse.AcceptTime"));
		querySupplementDetailResponse.setSbjDeadTime(_ctx.longValue("QuerySupplementDetailResponse.SbjDeadTime"));
		querySupplementDetailResponse.setAcceptDeadTime(_ctx.longValue("QuerySupplementDetailResponse.AcceptDeadTime"));
		querySupplementDetailResponse.setOperateTime(_ctx.longValue("QuerySupplementDetailResponse.OperateTime"));
		querySupplementDetailResponse.setUploadFileTemplateUrl(_ctx.stringValue("QuerySupplementDetailResponse.UploadFileTemplateUrl"));
		querySupplementDetailResponse.setContent(_ctx.stringValue("QuerySupplementDetailResponse.Content"));

		List<String> fileTemplateUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySupplementDetailResponse.FileTemplateUrls.Length"); i++) {
			fileTemplateUrls.add(_ctx.stringValue("QuerySupplementDetailResponse.FileTemplateUrls["+ i +"]"));
		}
		querySupplementDetailResponse.setFileTemplateUrls(fileTemplateUrls);
	 
	 	return querySupplementDetailResponse;
	}
}