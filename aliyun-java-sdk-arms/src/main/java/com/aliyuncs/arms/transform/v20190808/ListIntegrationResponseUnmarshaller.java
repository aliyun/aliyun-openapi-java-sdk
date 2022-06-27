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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListIntegrationResponse;
import com.aliyuncs.arms.model.v20190808.ListIntegrationResponse.PageInfo;
import com.aliyuncs.arms.model.v20190808.ListIntegrationResponse.PageInfo.Integrations;
import com.aliyuncs.arms.model.v20190808.ListIntegrationResponse.PageInfo.Integrations.IntegrationDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntegrationResponseUnmarshaller {

	public static ListIntegrationResponse unmarshall(ListIntegrationResponse listIntegrationResponse, UnmarshallerContext _ctx) {
		
		listIntegrationResponse.setRequestId(_ctx.stringValue("ListIntegrationResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(_ctx.longValue("ListIntegrationResponse.PageInfo.Total"));
		pageInfo.setSize(_ctx.longValue("ListIntegrationResponse.PageInfo.Size"));
		pageInfo.setPage(_ctx.longValue("ListIntegrationResponse.PageInfo.Page"));

		List<Integrations> iintegrations = new ArrayList<Integrations>();
		for (int i = 0; i < _ctx.lengthValue("ListIntegrationResponse.PageInfo.Iintegrations.Length"); i++) {
			Integrations integrations = new Integrations();
			integrations.setIntegrationId(_ctx.longValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationId"));
			integrations.setIntegrationName(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationName"));
			integrations.setIntegrationProductType(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationProductType"));
			integrations.setApiEndpoint(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].ApiEndpoint"));
			integrations.setShortToken(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].ShortToken"));
			integrations.setState(_ctx.booleanValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].State"));
			integrations.setLiveness(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].Liveness"));
			integrations.setCreateTime(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].CreateTime"));

			IntegrationDetail integrationDetail = new IntegrationDetail();
			integrationDetail.setDescription(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.Description"));
			integrationDetail.setDuplicateKey(_ctx.stringValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.DuplicateKey"));
			integrationDetail.setAutoRecover(_ctx.booleanValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.AutoRecover"));
			integrationDetail.setRecoverTime(_ctx.longValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.RecoverTime"));

			List<Long> stat = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.Stat.Length"); j++) {
				stat.add(_ctx.longValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.Stat["+ j +"]"));
			}
			integrationDetail.setStat(stat);

			List<Map<Object, Object>> fieldRedefineRules = _ctx.listMapValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.FieldRedefineRules");
			integrationDetail.setFieldRedefineRules(fieldRedefineRules);

			List<Map<Object, Object>> extendedFieldRedefineRules = _ctx.listMapValue("ListIntegrationResponse.PageInfo.Iintegrations["+ i +"].IntegrationDetail.ExtendedFieldRedefineRules");
			integrationDetail.setExtendedFieldRedefineRules(extendedFieldRedefineRules);
			integrations.setIntegrationDetail(integrationDetail);

			iintegrations.add(integrations);
		}
		pageInfo.setIintegrations(iintegrations);
		listIntegrationResponse.setPageInfo(pageInfo);
	 
	 	return listIntegrationResponse;
	}
}