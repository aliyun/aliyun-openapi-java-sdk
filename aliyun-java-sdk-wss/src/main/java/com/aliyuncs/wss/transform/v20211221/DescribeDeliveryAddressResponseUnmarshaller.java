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

package com.aliyuncs.wss.transform.v20211221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wss.model.v20211221.DescribeDeliveryAddressResponse;
import com.aliyuncs.wss.model.v20211221.DescribeDeliveryAddressResponse.Address;
import com.aliyuncs.wss.model.v20211221.DescribeDeliveryAddressResponse.Address.Area;
import com.aliyuncs.wss.model.v20211221.DescribeDeliveryAddressResponse.Address.City;
import com.aliyuncs.wss.model.v20211221.DescribeDeliveryAddressResponse.Address.Province;
import com.aliyuncs.wss.model.v20211221.DescribeDeliveryAddressResponse.Address.Town;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeliveryAddressResponseUnmarshaller {

	public static DescribeDeliveryAddressResponse unmarshall(DescribeDeliveryAddressResponse describeDeliveryAddressResponse, UnmarshallerContext _ctx) {
		
		describeDeliveryAddressResponse.setRequestId(_ctx.stringValue("DescribeDeliveryAddressResponse.RequestId"));
		describeDeliveryAddressResponse.setTotalCount(_ctx.integerValue("DescribeDeliveryAddressResponse.TotalCount"));

		List<Address> addresses = new ArrayList<Address>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeliveryAddressResponse.Addresses.Length"); i++) {
			Address address = new Address();
			address.setPostalCode(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].PostalCode"));
			address.setContacts(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Contacts"));
			address.setMobile(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Mobile"));
			address.setDefaultAddress(_ctx.booleanValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].DefaultAddress"));
			address.setDetail(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Detail"));

			Province province = new Province();
			province.setProvinceId(_ctx.longValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Province.ProvinceId"));
			province.setProvinceName(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Province.ProvinceName"));
			address.setProvince(province);

			City city = new City();
			city.setCityId(_ctx.longValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].City.CityId"));
			city.setCityName(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].City.CityName"));
			address.setCity(city);

			Area area = new Area();
			area.setAreaName(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Area.AreaName"));
			area.setAreaId(_ctx.longValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Area.AreaId"));
			address.setArea(area);

			Town town = new Town();
			town.setTownName(_ctx.stringValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Town.TownName"));
			town.setTownId(_ctx.longValue("DescribeDeliveryAddressResponse.Addresses["+ i +"].Town.TownId"));
			address.setTown(town);

			addresses.add(address);
		}
		describeDeliveryAddressResponse.setAddresses(addresses);
	 
	 	return describeDeliveryAddressResponse;
	}
}