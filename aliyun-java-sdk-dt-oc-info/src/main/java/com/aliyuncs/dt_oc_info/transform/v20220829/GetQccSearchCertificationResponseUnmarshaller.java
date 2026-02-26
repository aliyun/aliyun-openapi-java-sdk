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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetQccSearchCertificationResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQccSearchCertificationResponseUnmarshaller {

	public static GetQccSearchCertificationResponse unmarshall(GetQccSearchCertificationResponse getQccSearchCertificationResponse, UnmarshallerContext _ctx) {
		
		getQccSearchCertificationResponse.setRequestId(_ctx.stringValue("GetQccSearchCertificationResponse.RequestId"));
		getQccSearchCertificationResponse.setCode(_ctx.stringValue("GetQccSearchCertificationResponse.Code"));
		getQccSearchCertificationResponse.setSuccess(_ctx.booleanValue("GetQccSearchCertificationResponse.Success"));
		getQccSearchCertificationResponse.setMessage(_ctx.stringValue("GetQccSearchCertificationResponse.Message"));
		getQccSearchCertificationResponse.setTotalNum(_ctx.integerValue("GetQccSearchCertificationResponse.TotalNum"));
		getQccSearchCertificationResponse.setPageIndex(_ctx.integerValue("GetQccSearchCertificationResponse.PageIndex"));
		getQccSearchCertificationResponse.setPageNum(_ctx.integerValue("GetQccSearchCertificationResponse.PageNum"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetQccSearchCertificationResponse.Data");
		getQccSearchCertificationResponse.setData(data);
	 
	 	return getQccSearchCertificationResponse;
	}
}