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

package com.aliyuncs.datav_outer.transform.v20190402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datav_outer.model.v20190402.GetScreenDatasourceConfigResponse;
import com.aliyuncs.datav_outer.model.v20190402.GetScreenDatasourceConfigResponse.Datasource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScreenDatasourceConfigResponseUnmarshaller {

	public static GetScreenDatasourceConfigResponse unmarshall(GetScreenDatasourceConfigResponse getScreenDatasourceConfigResponse, UnmarshallerContext _ctx) {
		
		getScreenDatasourceConfigResponse.setRequestId(_ctx.stringValue("GetScreenDatasourceConfigResponse.RequestId"));

		List<Datasource> datasources = new ArrayList<Datasource>();
		for (int i = 0; i < _ctx.lengthValue("GetScreenDatasourceConfigResponse.Datasources.Length"); i++) {
			Datasource datasource = new Datasource();
			datasource.setApiName(_ctx.stringValue("GetScreenDatasourceConfigResponse.Datasources["+ i +"].ApiName"));
			datasource.setType(_ctx.stringValue("GetScreenDatasourceConfigResponse.Datasources["+ i +"].Type"));
			datasource.setDataConfig(_ctx.stringValue("GetScreenDatasourceConfigResponse.Datasources["+ i +"].DataConfig"));

			datasources.add(datasource);
		}
		getScreenDatasourceConfigResponse.setDatasources(datasources);
	 
	 	return getScreenDatasourceConfigResponse;
	}
}