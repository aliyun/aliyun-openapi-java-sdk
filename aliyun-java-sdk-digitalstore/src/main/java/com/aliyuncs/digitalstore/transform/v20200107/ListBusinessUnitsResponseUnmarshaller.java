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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListBusinessUnitsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListBusinessUnitsResponse.BusinessUnitModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusinessUnitsResponseUnmarshaller {

	public static ListBusinessUnitsResponse unmarshall(ListBusinessUnitsResponse listBusinessUnitsResponse, UnmarshallerContext _ctx) {
		
		listBusinessUnitsResponse.setRequestId(_ctx.stringValue("ListBusinessUnitsResponse.RequestId"));
		listBusinessUnitsResponse.setPageSize(_ctx.integerValue("ListBusinessUnitsResponse.PageSize"));
		listBusinessUnitsResponse.setTotalCount(_ctx.integerValue("ListBusinessUnitsResponse.TotalCount"));
		listBusinessUnitsResponse.setPageNumber(_ctx.integerValue("ListBusinessUnitsResponse.PageNumber"));
		listBusinessUnitsResponse.setSuccess(_ctx.booleanValue("ListBusinessUnitsResponse.Success"));

		List<BusinessUnitModel> businessUnits = new ArrayList<BusinessUnitModel>();
		for (int i = 0; i < _ctx.lengthValue("ListBusinessUnitsResponse.BusinessUnits.Length"); i++) {
			BusinessUnitModel businessUnitModel = new BusinessUnitModel();
			businessUnitModel.setBusinessUnitId(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].BusinessUnitId"));
			businessUnitModel.setCreateDate(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].CreateDate"));
			businessUnitModel.setPhoneNumber(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].PhoneNumber"));
			businessUnitModel.setName(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].Name"));
			businessUnitModel.setDescription(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].Description"));
			businessUnitModel.setDisable(_ctx.integerValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].Disable"));
			businessUnitModel.setContact(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].Contact"));
			businessUnitModel.setUpdateDate(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].UpdateDate"));
			businessUnitModel.setCode(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].Code"));
			businessUnitModel.setAddress(_ctx.stringValue("ListBusinessUnitsResponse.BusinessUnits["+ i +"].Address"));

			businessUnits.add(businessUnitModel);
		}
		listBusinessUnitsResponse.setBusinessUnits(businessUnits);
	 
	 	return listBusinessUnitsResponse;
	}
}