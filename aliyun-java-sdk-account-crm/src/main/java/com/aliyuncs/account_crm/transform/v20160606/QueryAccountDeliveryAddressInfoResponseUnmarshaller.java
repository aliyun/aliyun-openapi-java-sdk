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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.QueryAccountDeliveryAddressInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountDeliveryAddressInfoResponse.AddressList;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountDeliveryAddressInfoResponse.AddressList.AreaDivision;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountDeliveryAddressInfoResponse.AddressList.CityDivision;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountDeliveryAddressInfoResponse.AddressList.ProviceDivision;
import com.aliyuncs.account_crm.model.v20160606.QueryAccountDeliveryAddressInfoResponse.AddressList.TownDivision;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountDeliveryAddressInfoResponseUnmarshaller {

	public static QueryAccountDeliveryAddressInfoResponse unmarshall(QueryAccountDeliveryAddressInfoResponse queryAccountDeliveryAddressInfoResponse, UnmarshallerContext _ctx) {
		
		queryAccountDeliveryAddressInfoResponse.setRequestId(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.RequestId"));
		queryAccountDeliveryAddressInfoResponse.setMessage(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Message"));
		queryAccountDeliveryAddressInfoResponse.setCode(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Code"));
		queryAccountDeliveryAddressInfoResponse.setSuccess(_ctx.booleanValue("QueryAccountDeliveryAddressInfoResponse.Success"));

		List<AddressList> data = new ArrayList<AddressList>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccountDeliveryAddressInfoResponse.Data.Length"); i++) {
			AddressList addressList = new AddressList();
			addressList.setAddress(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Address"));
			addressList.setAreaId(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaId"));
			addressList.setCityId(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityId"));
			addressList.setContacts(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Contacts"));
			addressList.setDefaultAddress(_ctx.booleanValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].DefaultAddress"));
			addressList.setEmail(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Email"));
			addressList.setMobile(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Mobile"));
			addressList.setPhone(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Phone"));
			addressList.setPk(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Pk"));
			addressList.setPostalcode(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].Postalcode"));
			addressList.setProviceId(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceId"));
			addressList.setTownId(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownId"));

			AreaDivision areaDivision = new AreaDivision();
			areaDivision.setDivisionAbbName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.DivisionAbbName"));
			areaDivision.setDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.DivisionId"));
			areaDivision.setDivisionLevel(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.DivisionLevel"));
			areaDivision.setDivisionName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.DivisionName"));
			areaDivision.setDivisionTname(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.DivisionTname"));
			areaDivision.setNewDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.NewDivisionId"));
			areaDivision.setParentId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.ParentId"));
			areaDivision.setPinyin(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.Pinyin"));
			areaDivision.setRemark(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].AreaDivision.Remark"));
			addressList.setAreaDivision(areaDivision);

			CityDivision cityDivision = new CityDivision();
			cityDivision.setDivisionAbbName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.DivisionAbbName"));
			cityDivision.setDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.DivisionId"));
			cityDivision.setDivisionLevel(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.DivisionLevel"));
			cityDivision.setDivisionName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.DivisionName"));
			cityDivision.setDivisionTname(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.DivisionTname"));
			cityDivision.setNewDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.NewDivisionId"));
			cityDivision.setParentId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.ParentId"));
			cityDivision.setPinyin(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.Pinyin"));
			cityDivision.setRemark(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].CityDivision.Remark"));
			addressList.setCityDivision(cityDivision);

			ProviceDivision proviceDivision = new ProviceDivision();
			proviceDivision.setDivisionAbbName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.DivisionAbbName"));
			proviceDivision.setDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.DivisionId"));
			proviceDivision.setDivisionLevel(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.DivisionLevel"));
			proviceDivision.setDivisionName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.DivisionName"));
			proviceDivision.setDivisionTname(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.DivisionTname"));
			proviceDivision.setNewDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.NewDivisionId"));
			proviceDivision.setParentId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.ParentId"));
			proviceDivision.setPinyin(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.Pinyin"));
			proviceDivision.setRemark(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].ProviceDivision.Remark"));
			addressList.setProviceDivision(proviceDivision);

			TownDivision townDivision = new TownDivision();
			townDivision.setDivisionAbbName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.DivisionAbbName"));
			townDivision.setDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.DivisionId"));
			townDivision.setDivisionLevel(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.DivisionLevel"));
			townDivision.setDivisionName(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.DivisionName"));
			townDivision.setDivisionTname(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.DivisionTname"));
			townDivision.setNewDivisionId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.NewDivisionId"));
			townDivision.setParentId(_ctx.longValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.ParentId"));
			townDivision.setPinyin(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.Pinyin"));
			townDivision.setRemark(_ctx.stringValue("QueryAccountDeliveryAddressInfoResponse.Data["+ i +"].TownDivision.Remark"));
			addressList.setTownDivision(townDivision);

			data.add(addressList);
		}
		queryAccountDeliveryAddressInfoResponse.setData(data);
	 
	 	return queryAccountDeliveryAddressInfoResponse;
	}
}