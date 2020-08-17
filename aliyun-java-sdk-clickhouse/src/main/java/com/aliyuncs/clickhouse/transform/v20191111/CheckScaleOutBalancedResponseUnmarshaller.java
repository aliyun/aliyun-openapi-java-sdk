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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.CheckScaleOutBalancedResponse;
import com.aliyuncs.clickhouse.model.v20191111.CheckScaleOutBalancedResponse.TableDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckScaleOutBalancedResponseUnmarshaller {

	public static CheckScaleOutBalancedResponse unmarshall(CheckScaleOutBalancedResponse checkScaleOutBalancedResponse, UnmarshallerContext _ctx) {
		
		checkScaleOutBalancedResponse.setRequestId(_ctx.stringValue("CheckScaleOutBalancedResponse.RequestId"));
		checkScaleOutBalancedResponse.setPageNumber(_ctx.integerValue("CheckScaleOutBalancedResponse.PageNumber"));
		checkScaleOutBalancedResponse.setTotalCount(_ctx.integerValue("CheckScaleOutBalancedResponse.TotalCount"));
		checkScaleOutBalancedResponse.setPageSize(_ctx.integerValue("CheckScaleOutBalancedResponse.PageSize"));
		checkScaleOutBalancedResponse.setCheckCode(_ctx.stringValue("CheckScaleOutBalancedResponse.CheckCode"));
		checkScaleOutBalancedResponse.setTimeDuration(_ctx.stringValue("CheckScaleOutBalancedResponse.TimeDuration"));

		List<TableDetail> tableDetails = new ArrayList<TableDetail>();
		for (int i = 0; i < _ctx.lengthValue("CheckScaleOutBalancedResponse.TableDetails.Length"); i++) {
			TableDetail tableDetail = new TableDetail();
			tableDetail.setTableName(_ctx.stringValue("CheckScaleOutBalancedResponse.TableDetails["+ i +"].TableName"));
			tableDetail.setDatabase(_ctx.stringValue("CheckScaleOutBalancedResponse.TableDetails["+ i +"].Database"));
			tableDetail.setCluster(_ctx.stringValue("CheckScaleOutBalancedResponse.TableDetails["+ i +"].Cluster"));
			tableDetail.setDetail(_ctx.integerValue("CheckScaleOutBalancedResponse.TableDetails["+ i +"].Detail"));

			tableDetails.add(tableDetail);
		}
		checkScaleOutBalancedResponse.setTableDetails(tableDetails);
	 
	 	return checkScaleOutBalancedResponse;
	}
}