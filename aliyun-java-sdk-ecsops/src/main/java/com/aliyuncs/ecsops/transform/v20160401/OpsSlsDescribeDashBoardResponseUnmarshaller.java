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

import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeDashBoardResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeDashBoardResponse.DashBoards;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSlsDescribeDashBoardResponseUnmarshaller {

	public static OpsSlsDescribeDashBoardResponse unmarshall(OpsSlsDescribeDashBoardResponse opsSlsDescribeDashBoardResponse, UnmarshallerContext _ctx) {
		
		opsSlsDescribeDashBoardResponse.setRequestId(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.RequestId"));
		opsSlsDescribeDashBoardResponse.setMessage(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Message"));
		opsSlsDescribeDashBoardResponse.setCode(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Code"));
		opsSlsDescribeDashBoardResponse.setSuccess(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Success"));
		opsSlsDescribeDashBoardResponse.setPageSize(_ctx.longValue("OpsSlsDescribeDashBoardResponse.PageSize"));
		opsSlsDescribeDashBoardResponse.setPageNo(_ctx.longValue("OpsSlsDescribeDashBoardResponse.PageNo"));
		opsSlsDescribeDashBoardResponse.setTotal(_ctx.longValue("OpsSlsDescribeDashBoardResponse.Total"));

		List<DashBoards> data = new ArrayList<DashBoards>();
		for (int i = 0; i < _ctx.lengthValue("OpsSlsDescribeDashBoardResponse.Data.Length"); i++) {
			DashBoards dashBoards = new DashBoards();
			dashBoards.setDashboardName(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Data["+ i +"].DashboardName"));
			dashBoards.setDescription(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Data["+ i +"].Description"));
			dashBoards.setDisplayName(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Data["+ i +"].DisplayName"));
			dashBoards.setAttribute(_ctx.stringValue("OpsSlsDescribeDashBoardResponse.Data["+ i +"].Attribute"));

			data.add(dashBoards);
		}
		opsSlsDescribeDashBoardResponse.setData(data);
	 
	 	return opsSlsDescribeDashBoardResponse;
	}
}