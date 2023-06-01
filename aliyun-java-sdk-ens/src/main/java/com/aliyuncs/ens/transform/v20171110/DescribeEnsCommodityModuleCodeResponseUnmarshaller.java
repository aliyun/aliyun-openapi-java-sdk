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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsCommodityModuleCodeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfoItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfoItem.ModuleCodesInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsCommodityModuleCodeResponseUnmarshaller {

	public static DescribeEnsCommodityModuleCodeResponse unmarshall(DescribeEnsCommodityModuleCodeResponse describeEnsCommodityModuleCodeResponse, UnmarshallerContext _ctx) {
		
		describeEnsCommodityModuleCodeResponse.setRequestId(_ctx.stringValue("DescribeEnsCommodityModuleCodeResponse.RequestId"));

		List<CommodityCodesInfoItem> commodityCodesInfo = new ArrayList<CommodityCodesInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfo.Length"); i++) {
			CommodityCodesInfoItem commodityCodesInfoItem = new CommodityCodesInfoItem();
			commodityCodesInfoItem.setCommodityCode(_ctx.stringValue("DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfo["+ i +"].CommodityCode"));

			List<ModuleCodesInfoItem> moduleCodesInfo = new ArrayList<ModuleCodesInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfo["+ i +"].ModuleCodesInfo.Length"); j++) {
				ModuleCodesInfoItem moduleCodesInfoItem = new ModuleCodesInfoItem();
				moduleCodesInfoItem.setModuleCode(_ctx.stringValue("DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfo["+ i +"].ModuleCodesInfo["+ j +"].ModuleCode"));
				moduleCodesInfoItem.setModuleName(_ctx.stringValue("DescribeEnsCommodityModuleCodeResponse.CommodityCodesInfo["+ i +"].ModuleCodesInfo["+ j +"].ModuleName"));

				moduleCodesInfo.add(moduleCodesInfoItem);
			}
			commodityCodesInfoItem.setModuleCodesInfo(moduleCodesInfo);

			commodityCodesInfo.add(commodityCodesInfoItem);
		}
		describeEnsCommodityModuleCodeResponse.setCommodityCodesInfo(commodityCodesInfo);
	 
	 	return describeEnsCommodityModuleCodeResponse;
	}
}