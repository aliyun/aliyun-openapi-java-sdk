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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppqueryprofileResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppqueryprofileResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppqueryprofileResponse unmarshall(QueryLinkedeploycoreDeploycoreAppqueryprofileResponse queryLinkedeploycoreDeploycoreAppqueryprofileResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Message"));
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.AppName"));
		data.setDefaultBuildPackVersion(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.DefaultBuildPackVersion"));
		data.setEnvName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.EnvName"));
		data.setFrontApp(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.FrontApp"));
		data.setImageId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.ImageId"));
		data.setName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Name"));
		data.setStationName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.StationName"));
		data.setTechStack(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.TechStack"));
		data.setTenantId(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.TenantId"));
		data.setTenantName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.TenantName"));

		List<String> buildPackVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.BuildPackVersions.Length"); i++) {
			buildPackVersions.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.BuildPackVersions["+ i +"]"));
		}
		data.setBuildPackVersions(buildPackVersions);

		List<String> customized = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Customized.Length"); i++) {
			customized.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Customized["+ i +"]"));
		}
		data.setCustomized(customized);

		List<String> iteration = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Iteration.Length"); i++) {
			iteration.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Iteration["+ i +"]"));
		}
		data.setIteration(iteration);

		List<String> latestTag = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.LatestTag.Length"); i++) {
			latestTag.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.LatestTag["+ i +"]"));
		}
		data.setLatestTag(latestTag);

		List<String> sidecars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Sidecars.Length"); i++) {
			sidecars.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Sidecars["+ i +"]"));
		}
		data.setSidecars(sidecars);

		List<String> trunk = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Trunk.Length"); i++) {
			trunk.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.Trunk["+ i +"]"));
		}
		data.setTrunk(trunk);

		List<String> zoneList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.ZoneList.Length"); i++) {
			zoneList.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryprofileResponse.Data.ZoneList["+ i +"]"));
		}
		data.setZoneList(zoneList);
		queryLinkedeploycoreDeploycoreAppqueryprofileResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppqueryprofileResponse;
	}
}