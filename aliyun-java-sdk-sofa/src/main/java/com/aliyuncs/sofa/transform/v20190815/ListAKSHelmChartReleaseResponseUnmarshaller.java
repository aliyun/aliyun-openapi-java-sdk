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

import com.aliyuncs.sofa.model.v20190815.ListAKSHelmChartReleaseResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSHelmChartReleaseResponse.ChartReleasesItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSHelmChartReleaseResponse.ChartReleasesItem.ExtraData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSHelmChartReleaseResponseUnmarshaller {

	public static ListAKSHelmChartReleaseResponse unmarshall(ListAKSHelmChartReleaseResponse listAKSHelmChartReleaseResponse, UnmarshallerContext _ctx) {
		
		listAKSHelmChartReleaseResponse.setRequestId(_ctx.stringValue("ListAKSHelmChartReleaseResponse.RequestId"));
		listAKSHelmChartReleaseResponse.setResultCode(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ResultCode"));
		listAKSHelmChartReleaseResponse.setResultMessage(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ResultMessage"));
		listAKSHelmChartReleaseResponse.setTotalCount(_ctx.longValue("ListAKSHelmChartReleaseResponse.TotalCount"));

		List<ChartReleasesItem> chartReleases = new ArrayList<ChartReleasesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSHelmChartReleaseResponse.ChartReleases.Length"); i++) {
			ChartReleasesItem chartReleasesItem = new ChartReleasesItem();
			chartReleasesItem.setChartId(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ChartId"));
			chartReleasesItem.setChartName(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ChartName"));
			chartReleasesItem.setChartVersion(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ChartVersion"));
			chartReleasesItem.setClusterId(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ClusterId"));
			chartReleasesItem.setGmtCreated(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].GmtCreated"));
			chartReleasesItem.setGmtModified(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].GmtModified"));
			chartReleasesItem.setId(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].Id"));
			chartReleasesItem.setNamespace(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].Namespace"));
			chartReleasesItem.setOperator(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].Operator"));
			chartReleasesItem.setReleaseLog(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ReleaseLog"));
			chartReleasesItem.setReleaseName(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ReleaseName"));
			chartReleasesItem.setRevision(_ctx.longValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].Revision"));
			chartReleasesItem.setStatus(_ctx.longValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].Status"));
			chartReleasesItem.setSuperseded(_ctx.longValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].Superseded"));

			ExtraData extraData = new ExtraData();
			extraData.setChartType(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ExtraData.ChartType"));
			extraData.setIcon(_ctx.stringValue("ListAKSHelmChartReleaseResponse.ChartReleases["+ i +"].ExtraData.Icon"));
			chartReleasesItem.setExtraData(extraData);

			chartReleases.add(chartReleasesItem);
		}
		listAKSHelmChartReleaseResponse.setChartReleases(chartReleases);
	 
	 	return listAKSHelmChartReleaseResponse;
	}
}