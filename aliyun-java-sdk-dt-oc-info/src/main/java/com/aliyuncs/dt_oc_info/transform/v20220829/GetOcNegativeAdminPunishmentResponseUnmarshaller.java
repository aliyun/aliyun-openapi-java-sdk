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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeAdminPunishmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcNegativeAdminPunishmentResponseUnmarshaller {

	public static GetOcNegativeAdminPunishmentResponse unmarshall(GetOcNegativeAdminPunishmentResponse getOcNegativeAdminPunishmentResponse, UnmarshallerContext _ctx) {
		
		getOcNegativeAdminPunishmentResponse.setRequestId(_ctx.stringValue("GetOcNegativeAdminPunishmentResponse.RequestId"));
		getOcNegativeAdminPunishmentResponse.setCode(_ctx.stringValue("GetOcNegativeAdminPunishmentResponse.Code"));
		getOcNegativeAdminPunishmentResponse.setSuccess(_ctx.booleanValue("GetOcNegativeAdminPunishmentResponse.Success"));
		getOcNegativeAdminPunishmentResponse.setMessage(_ctx.stringValue("GetOcNegativeAdminPunishmentResponse.Message"));
		getOcNegativeAdminPunishmentResponse.setTotalNum(_ctx.integerValue("GetOcNegativeAdminPunishmentResponse.TotalNum"));
		getOcNegativeAdminPunishmentResponse.setPageIndex(_ctx.integerValue("GetOcNegativeAdminPunishmentResponse.PageIndex"));
		getOcNegativeAdminPunishmentResponse.setPageNum(_ctx.integerValue("GetOcNegativeAdminPunishmentResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcNegativeAdminPunishmentResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcNegativeAdminPunishmentResponse.Data["+ i +"]"));
		}
		getOcNegativeAdminPunishmentResponse.setData(data);
	 
	 	return getOcNegativeAdminPunishmentResponse;
	}
}