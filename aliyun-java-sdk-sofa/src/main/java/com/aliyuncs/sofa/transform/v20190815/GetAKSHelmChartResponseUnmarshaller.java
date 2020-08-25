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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartResponse.ChartPackage;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartResponse.ChartPackage.ChartMetaData;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartResponse.ChartPackage.SubChartsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSHelmChartResponseUnmarshaller {

	public static GetAKSHelmChartResponse unmarshall(GetAKSHelmChartResponse getAKSHelmChartResponse, UnmarshallerContext _ctx) {
		
		getAKSHelmChartResponse.setRequestId(_ctx.stringValue("GetAKSHelmChartResponse.RequestId"));
		getAKSHelmChartResponse.setResultCode(_ctx.stringValue("GetAKSHelmChartResponse.ResultCode"));
		getAKSHelmChartResponse.setResultMessage(_ctx.stringValue("GetAKSHelmChartResponse.ResultMessage"));

		ChartPackage chartPackage = new ChartPackage();
		chartPackage.setChartType(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartType"));
		chartPackage.setDescription(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.Description"));
		chartPackage.setGmtCreated(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.GmtCreated"));
		chartPackage.setGmtModified(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.GmtModified"));
		chartPackage.setName(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.Name"));
		chartPackage.setOperator(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.Operator"));
		chartPackage.setReadme(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.Readme"));
		chartPackage.setRegionId(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.RegionId"));
		chartPackage.setVersion(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.Version"));

		ChartMetaData chartMetaData = new ChartMetaData();
		chartMetaData.setApiVersion(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.ApiVersion"));
		chartMetaData.setAppVersion(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.AppVersion"));
		chartMetaData.setDescription(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.Description"));
		chartMetaData.setIcon(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.Icon"));
		chartMetaData.setName(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.Name"));
		chartMetaData.setType(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.Type"));
		chartMetaData.setVersion(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.ChartMetaData.Version"));
		chartPackage.setChartMetaData(chartMetaData);

		List<SubChartsItem> subCharts = new ArrayList<SubChartsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSHelmChartResponse.ChartPackage.SubCharts.Length"); i++) {
			SubChartsItem subChartsItem = new SubChartsItem();
			subChartsItem.setName(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.SubCharts["+ i +"].Name"));
			subChartsItem.setVersion(_ctx.stringValue("GetAKSHelmChartResponse.ChartPackage.SubCharts["+ i +"].Version"));

			subCharts.add(subChartsItem);
		}
		chartPackage.setSubCharts(subCharts);
		getAKSHelmChartResponse.setChartPackage(chartPackage);
	 
	 	return getAKSHelmChartResponse;
	}
}