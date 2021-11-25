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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetPatentFeeStatisticsInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentFeeStatisticsInfoResponse.Data;
import com.aliyuncs.copyright.model.v20190123.GetPatentFeeStatisticsInfoResponse.Data.AgeInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentFeeStatisticsInfoResponseUnmarshaller {

	public static GetPatentFeeStatisticsInfoResponse unmarshall(GetPatentFeeStatisticsInfoResponse getPatentFeeStatisticsInfoResponse, UnmarshallerContext _ctx) {
		
		getPatentFeeStatisticsInfoResponse.setRequestId(_ctx.stringValue("GetPatentFeeStatisticsInfoResponse.RequestId"));
		getPatentFeeStatisticsInfoResponse.setSuccess(_ctx.booleanValue("GetPatentFeeStatisticsInfoResponse.Success"));

		Data data = new Data();
		data.setDiscountPrice(_ctx.floatValue("GetPatentFeeStatisticsInfoResponse.Data.DiscountPrice"));
		data.setFamingCount(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.FamingCount"));
		data.setFreeCount(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.FreeCount"));
		data.setShiyongCount(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.ShiyongCount"));
		data.setTotal(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.Total"));
		data.setTotalPrice(_ctx.floatValue("GetPatentFeeStatisticsInfoResponse.Data.TotalPrice"));
		data.setUsedCount(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.UsedCount"));
		data.setUserType(_ctx.stringValue("GetPatentFeeStatisticsInfoResponse.Data.UserType"));
		data.setWaiguanCount(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.WaiguanCount"));

		List<AgeInfoItem> ageInfo = new ArrayList<AgeInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentFeeStatisticsInfoResponse.Data.AgeInfo.Length"); i++) {
			AgeInfoItem ageInfoItem = new AgeInfoItem();
			ageInfoItem.setAge(_ctx.stringValue("GetPatentFeeStatisticsInfoResponse.Data.AgeInfo["+ i +"].Age"));
			ageInfoItem.setCount(_ctx.integerValue("GetPatentFeeStatisticsInfoResponse.Data.AgeInfo["+ i +"].Count"));
			ageInfoItem.setDiscountPrice(_ctx.floatValue("GetPatentFeeStatisticsInfoResponse.Data.AgeInfo["+ i +"].DiscountPrice"));
			ageInfoItem.setSalePrice(_ctx.floatValue("GetPatentFeeStatisticsInfoResponse.Data.AgeInfo["+ i +"].SalePrice"));
			ageInfoItem.setType(_ctx.stringValue("GetPatentFeeStatisticsInfoResponse.Data.AgeInfo["+ i +"].Type"));

			ageInfo.add(ageInfoItem);
		}
		data.setAgeInfo(ageInfo);
		getPatentFeeStatisticsInfoResponse.setData(data);
	 
	 	return getPatentFeeStatisticsInfoResponse;
	}
}