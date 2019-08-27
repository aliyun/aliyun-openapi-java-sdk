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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetAnalyzeCommodityDataResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetAnalyzeCommodityDataResponse.AnalyzeCommodityItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAnalyzeCommodityDataResponseUnmarshaller {

	public static GetAnalyzeCommodityDataResponse unmarshall(GetAnalyzeCommodityDataResponse getAnalyzeCommodityDataResponse, UnmarshallerContext _ctx) {
		
		getAnalyzeCommodityDataResponse.setPageIndex(_ctx.integerValue("GetAnalyzeCommodityDataResponse.PageIndex"));
		getAnalyzeCommodityDataResponse.setTotal(_ctx.integerValue("GetAnalyzeCommodityDataResponse.Total"));
		getAnalyzeCommodityDataResponse.setPageSize(_ctx.integerValue("GetAnalyzeCommodityDataResponse.PageSize"));

		List<AnalyzeCommodityItem> analyzeCommodityItems = new ArrayList<AnalyzeCommodityItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAnalyzeCommodityDataResponse.AnalyzeCommodityItems.Length"); i++) {
			AnalyzeCommodityItem analyzeCommodityItem = new AnalyzeCommodityItem();
			analyzeCommodityItem.setLocationNames(_ctx.stringValue("GetAnalyzeCommodityDataResponse.AnalyzeCommodityItems["+ i +"].LocationNames"));
			analyzeCommodityItem.setSupportCount(_ctx.longValue("GetAnalyzeCommodityDataResponse.AnalyzeCommodityItems["+ i +"].SupportCount"));
			analyzeCommodityItem.setLocationIds(_ctx.stringValue("GetAnalyzeCommodityDataResponse.AnalyzeCommodityItems["+ i +"].LocationIds"));
			analyzeCommodityItem.setItemCount(_ctx.longValue("GetAnalyzeCommodityDataResponse.AnalyzeCommodityItems["+ i +"].ItemCount"));

			analyzeCommodityItems.add(analyzeCommodityItem);
		}
		getAnalyzeCommodityDataResponse.setAnalyzeCommodityItems(analyzeCommodityItems);
	 
	 	return getAnalyzeCommodityDataResponse;
	}
}