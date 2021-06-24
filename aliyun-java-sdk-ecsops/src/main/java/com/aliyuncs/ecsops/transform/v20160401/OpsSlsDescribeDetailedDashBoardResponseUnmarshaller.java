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

import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeDetailedDashBoardResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeDetailedDashBoardResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeDetailedDashBoardResponse.Data.Charts;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSlsDescribeDetailedDashBoardResponseUnmarshaller {

	public static OpsSlsDescribeDetailedDashBoardResponse unmarshall(OpsSlsDescribeDetailedDashBoardResponse opsSlsDescribeDetailedDashBoardResponse, UnmarshallerContext _ctx) {
		
		opsSlsDescribeDetailedDashBoardResponse.setRequestId(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.RequestId"));
		opsSlsDescribeDetailedDashBoardResponse.setMessage(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Message"));
		opsSlsDescribeDetailedDashBoardResponse.setCode(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Code"));
		opsSlsDescribeDetailedDashBoardResponse.setSuccess(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Success"));
		opsSlsDescribeDetailedDashBoardResponse.setPageSize(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.PageSize"));
		opsSlsDescribeDetailedDashBoardResponse.setPageNo(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.PageNo"));
		opsSlsDescribeDetailedDashBoardResponse.setTotal(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.Total"));

		Data data = new Data();
		data.setDashboardName(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.DashboardName"));
		data.setDescription(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.Description"));
		data.setDisplayName(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.DisplayName"));
		data.setAttribute(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.Attribute"));

		List<Charts> chartList = new ArrayList<Charts>();
		for (int i = 0; i < _ctx.lengthValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList.Length"); i++) {
			Charts charts = new Charts();
			charts.setTitle(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Title"));
			charts.setLogstore(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Logstore"));
			charts.setType(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Type"));
			charts.setTopic(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Topic"));
			charts.setQuery(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Query"));
			charts.setStart(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Start"));
			charts.setEnd(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].End"));
			charts.setDisplayName(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].DisplayName"));
			charts.setRawSearchAttr(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].RawSearchAttr"));
			charts.setRawDisplayAttr(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].RawDisplayAttr"));
			charts.setRawActionAttr(_ctx.stringValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].RawActionAttr"));
			charts.setXPosition(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].XPosition"));
			charts.setYPosition(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].YPosition"));
			charts.setWidth(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Width"));
			charts.setHeight(_ctx.longValue("OpsSlsDescribeDetailedDashBoardResponse.Data.ChartList["+ i +"].Height"));

			chartList.add(charts);
		}
		data.setChartList(chartList);
		opsSlsDescribeDetailedDashBoardResponse.setData(data);
	 
	 	return opsSlsDescribeDetailedDashBoardResponse;
	}
}