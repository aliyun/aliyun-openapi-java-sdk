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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetCloudAssetCriteriaResponse;
import com.aliyuncs.sas.model.v20181203.GetCloudAssetCriteriaResponse.Criteria;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudAssetCriteriaResponseUnmarshaller {

	public static GetCloudAssetCriteriaResponse unmarshall(GetCloudAssetCriteriaResponse getCloudAssetCriteriaResponse, UnmarshallerContext _ctx) {
		
		getCloudAssetCriteriaResponse.setRequestId(_ctx.stringValue("GetCloudAssetCriteriaResponse.RequestId"));

		List<Criteria> criteriaList = new ArrayList<Criteria>();
		for (int i = 0; i < _ctx.lengthValue("GetCloudAssetCriteriaResponse.CriteriaList.Length"); i++) {
			Criteria criteria = new Criteria();
			criteria.setType(_ctx.stringValue("GetCloudAssetCriteriaResponse.CriteriaList["+ i +"].Type"));
			criteria.setName(_ctx.stringValue("GetCloudAssetCriteriaResponse.CriteriaList["+ i +"].Name"));
			criteria.setValues(_ctx.stringValue("GetCloudAssetCriteriaResponse.CriteriaList["+ i +"].Values"));
			criteria.setMultiValues(_ctx.stringValue("GetCloudAssetCriteriaResponse.CriteriaList["+ i +"].MultiValues"));

			criteriaList.add(criteria);
		}
		getCloudAssetCriteriaResponse.setCriteriaList(criteriaList);
	 
	 	return getCloudAssetCriteriaResponse;
	}
}