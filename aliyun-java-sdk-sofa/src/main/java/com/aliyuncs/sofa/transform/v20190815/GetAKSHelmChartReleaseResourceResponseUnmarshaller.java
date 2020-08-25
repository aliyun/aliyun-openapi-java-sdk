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

import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseResourceResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseResourceResponse.ChartResourceStatusesItem;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseResourceResponse.ChartResourceStatusesItem.ChartResourceItemsItem;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseResourceResponse.ChartResourceStatusesItem.ChartResourceItemsItem.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSHelmChartReleaseResourceResponseUnmarshaller {

	public static GetAKSHelmChartReleaseResourceResponse unmarshall(GetAKSHelmChartReleaseResourceResponse getAKSHelmChartReleaseResourceResponse, UnmarshallerContext _ctx) {
		
		getAKSHelmChartReleaseResourceResponse.setRequestId(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.RequestId"));
		getAKSHelmChartReleaseResourceResponse.setResultCode(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ResultCode"));
		getAKSHelmChartReleaseResourceResponse.setResultMessage(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ResultMessage"));

		List<ChartResourceStatusesItem> chartResourceStatuses = new ArrayList<ChartResourceStatusesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses.Length"); i++) {
			ChartResourceStatusesItem chartResourceStatusesItem = new ChartResourceStatusesItem();
			chartResourceStatusesItem.setChartName(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartName"));
			chartResourceStatusesItem.setChartVersion(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartVersion"));

			List<ChartResourceItemsItem> chartResourceItems = new ArrayList<ChartResourceItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems.Length"); j++) {
				ChartResourceItemsItem chartResourceItemsItem = new ChartResourceItemsItem();
				chartResourceItemsItem.setResourceType(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems["+ j +"].ResourceType"));

				List<String> columnList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems["+ j +"].ColumnList.Length"); k++) {
					columnList.add(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems["+ j +"].ColumnList["+ k +"]"));
				}
				chartResourceItemsItem.setColumnList(columnList);

				List<DataListItem> dataList = new ArrayList<DataListItem>();
				for (int k = 0; k < _ctx.lengthValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems["+ j +"].DataList.Length"); k++) {
					DataListItem dataListItem = new DataListItem();

					List<String> data = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems["+ j +"].DataList["+ k +"].Data.Length"); l++) {
						data.add(_ctx.stringValue("GetAKSHelmChartReleaseResourceResponse.ChartResourceStatuses["+ i +"].ChartResourceItems["+ j +"].DataList["+ k +"].Data["+ l +"]"));
					}
					dataListItem.setData(data);

					dataList.add(dataListItem);
				}
				chartResourceItemsItem.setDataList(dataList);

				chartResourceItems.add(chartResourceItemsItem);
			}
			chartResourceStatusesItem.setChartResourceItems(chartResourceItems);

			chartResourceStatuses.add(chartResourceStatusesItem);
		}
		getAKSHelmChartReleaseResourceResponse.setChartResourceStatuses(chartResourceStatuses);
	 
	 	return getAKSHelmChartReleaseResourceResponse;
	}
}