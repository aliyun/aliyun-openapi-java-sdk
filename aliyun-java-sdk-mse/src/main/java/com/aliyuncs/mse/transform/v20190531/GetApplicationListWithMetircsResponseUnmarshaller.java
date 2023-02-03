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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetApplicationListWithMetircsResponse;
import com.aliyuncs.mse.model.v20190531.GetApplicationListWithMetircsResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetApplicationListWithMetircsResponse.Data.ApplicationList;
import com.aliyuncs.mse.model.v20190531.GetApplicationListWithMetircsResponse.Data.ApplicationList.CurMetricsFm;
import com.aliyuncs.mse.model.v20190531.GetApplicationListWithMetircsResponse.Data.ApplicationList.CurMetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationListWithMetircsResponseUnmarshaller {

	public static GetApplicationListWithMetircsResponse unmarshall(GetApplicationListWithMetircsResponse getApplicationListWithMetircsResponse, UnmarshallerContext _ctx) {
		
		getApplicationListWithMetircsResponse.setRequestId(_ctx.stringValue("GetApplicationListWithMetircsResponse.RequestId"));
		getApplicationListWithMetircsResponse.setHttpStatusCode(_ctx.integerValue("GetApplicationListWithMetircsResponse.HttpStatusCode"));
		getApplicationListWithMetircsResponse.setMessage(_ctx.stringValue("GetApplicationListWithMetircsResponse.Message"));
		getApplicationListWithMetircsResponse.setCode(_ctx.integerValue("GetApplicationListWithMetircsResponse.Code"));
		getApplicationListWithMetircsResponse.setSuccess(_ctx.booleanValue("GetApplicationListWithMetircsResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("GetApplicationListWithMetircsResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("GetApplicationListWithMetircsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetApplicationListWithMetircsResponse.Data.PageSize"));

		List<ApplicationList> result = new ArrayList<ApplicationList>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationListWithMetircsResponse.Data.Result.Length"); i++) {
			ApplicationList applicationList = new ApplicationList();
			applicationList.setStatus(_ctx.longValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].Status"));
			applicationList.setExtraInfo(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].ExtraInfo"));
			applicationList.setAppName(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].AppName"));
			applicationList.setLicenseKey(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].LicenseKey"));
			applicationList.setAppId(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].AppId"));
			applicationList.setUserId(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].UserId"));
			applicationList.setInstancesNumber(_ctx.integerValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].InstancesNumber"));
			applicationList.setSource(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].Source"));
			applicationList.setLanguage(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].Language"));
			applicationList.setRegionId(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].RegionId"));
			applicationList.setNamespace(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].Namespace"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].Tags["+ j +"]"));
			}
			applicationList.setTags(tags);

			CurMetricsFm curMetricsFm = new CurMetricsFm();
			curMetricsFm.setTimestamp(_ctx.longValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.Timestamp"));
			curMetricsFm.setQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.Qps"));
			curMetricsFm.setExpQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.ExpQps"));
			curMetricsFm.setRt(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.Rt"));
			curMetricsFm.setPassQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.PassQps"));
			curMetricsFm.setBlockQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.BlockQps"));
			curMetricsFm.setThread(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetricsFm.Thread"));
			applicationList.setCurMetricsFm(curMetricsFm);

			List<CurMetricsItem> curMetrics = new ArrayList<CurMetricsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics.Length"); j++) {
				CurMetricsItem curMetricsItem = new CurMetricsItem();
				curMetricsItem.setTimestamp(_ctx.longValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].Timestamp"));
				curMetricsItem.setQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].Qps"));
				curMetricsItem.setExpQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].ExpQps"));
				curMetricsItem.setRt(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].Rt"));
				curMetricsItem.setPassQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].PassQps"));
				curMetricsItem.setBlockQps(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].BlockQps"));
				curMetricsItem.setThread(_ctx.doubleValue("GetApplicationListWithMetircsResponse.Data.Result["+ i +"].CurMetrics["+ j +"].Thread"));

				curMetrics.add(curMetricsItem);
			}
			applicationList.setCurMetrics(curMetrics);

			result.add(applicationList);
		}
		data.setResult(result);
		getApplicationListWithMetircsResponse.setData(data);
	 
	 	return getApplicationListWithMetircsResponse;
	}
}