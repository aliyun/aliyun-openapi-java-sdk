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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.GetCommercialStatusResponse;
import com.aliyuncs.arms.model.v20190808.GetCommercialStatusResponse.UserAndCommodityStatus;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCommercialStatusResponseUnmarshaller {

	public static GetCommercialStatusResponse unmarshall(GetCommercialStatusResponse getCommercialStatusResponse, UnmarshallerContext _ctx) {
		
		getCommercialStatusResponse.setRequestId(_ctx.stringValue("GetCommercialStatusResponse.RequestId"));

		UserAndCommodityStatus userAndCommodityStatus = new UserAndCommodityStatus();
		userAndCommodityStatus.setStatus(_ctx.stringValue("GetCommercialStatusResponse.UserAndCommodityStatus.Status"));
		userAndCommodityStatus.setFreeDays(_ctx.longValue("GetCommercialStatusResponse.UserAndCommodityStatus.FreeDays"));
		userAndCommodityStatus.setBasic(_ctx.booleanValue("GetCommercialStatusResponse.UserAndCommodityStatus.Basic"));
		userAndCommodityStatus.setChargeType(_ctx.stringValue("GetCommercialStatusResponse.UserAndCommodityStatus.ChargeType"));
		userAndCommodityStatus.setLable(_ctx.stringValue("GetCommercialStatusResponse.UserAndCommodityStatus.Lable"));
		userAndCommodityStatus.setExtraInfo(_ctx.mapValue("GetCommercialStatusResponse.UserAndCommodityStatus.ExtraInfo"));
		userAndCommodityStatus.setEnable(_ctx.booleanValue("GetCommercialStatusResponse.UserAndCommodityStatus.Enable"));
		getCommercialStatusResponse.setUserAndCommodityStatus(userAndCommodityStatus);
	 
	 	return getCommercialStatusResponse;
	}
}