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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEccQuerySpecItemDiffNcsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQuerySpecItemDiffNcsResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEccQuerySpecItemDiffNcsResponseUnmarshaller {

	public static OpsEccQuerySpecItemDiffNcsResponse unmarshall(OpsEccQuerySpecItemDiffNcsResponse opsEccQuerySpecItemDiffNcsResponse, UnmarshallerContext _ctx) {
		
		opsEccQuerySpecItemDiffNcsResponse.setRequestId(_ctx.stringValue("OpsEccQuerySpecItemDiffNcsResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("OpsEccQuerySpecItemDiffNcsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("OpsEccQuerySpecItemDiffNcsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("OpsEccQuerySpecItemDiffNcsResponse.Data.TotalCount"));

		List<CompareResultItem> compareResult = new ArrayList<CompareResultItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResult.Length"); i++) {
			CompareResultItem compareResultItem = new CompareResultItem();
			compareResultItem.setConfigName(_ctx.stringValue("OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResult["+ i +"].ConfigName"));
			compareResultItem.setSn(_ctx.stringValue("OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResult["+ i +"].Sn"));
			compareResultItem.setConfigValue(_ctx.stringValue("OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResult["+ i +"].ConfigValue"));
			compareResultItem.setNcIp(_ctx.stringValue("OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResult["+ i +"].NcIp"));
			compareResultItem.setComparisonValue(_ctx.stringValue("OpsEccQuerySpecItemDiffNcsResponse.Data.CompareResult["+ i +"].ComparisonValue"));

			compareResult.add(compareResultItem);
		}
		data.setCompareResult(compareResult);
		opsEccQuerySpecItemDiffNcsResponse.setData(data);
	 
	 	return opsEccQuerySpecItemDiffNcsResponse;
	}
}