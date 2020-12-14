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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListPersonDetailsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListPersonDetailsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonDetailsResponseUnmarshaller {

	public static ListPersonDetailsResponse unmarshall(ListPersonDetailsResponse listPersonDetailsResponse, UnmarshallerContext _ctx) {
		
		listPersonDetailsResponse.setRequestId(_ctx.stringValue("ListPersonDetailsResponse.RequestId"));
		listPersonDetailsResponse.setCode(_ctx.stringValue("ListPersonDetailsResponse.Code"));
		listPersonDetailsResponse.setMessage(_ctx.stringValue("ListPersonDetailsResponse.Message"));
		listPersonDetailsResponse.setPageNumber(_ctx.longValue("ListPersonDetailsResponse.PageNumber"));
		listPersonDetailsResponse.setPageSize(_ctx.longValue("ListPersonDetailsResponse.PageSize"));
		listPersonDetailsResponse.setTotalCount(_ctx.longValue("ListPersonDetailsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setPersonId(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].PersonId"));
			datas.setGender(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].Gender"));
			datas.setAge(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].Age"));
			datas.setProfession(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].Profession"));
			datas.setAddress(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].Address"));
			datas.setTransportation(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].Transportation"));
			datas.setPersonType(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].PersonType"));
			datas.setHotSpotAddress(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].HotSpotAddress"));
			datas.setUpdateTime(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].UpdateTime"));
			datas.setPreferredColor(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].PreferredColor"));
			datas.setFaceSourceImage(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].FaceSourceImage"));
			datas.setFaceTargetImage(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].FaceTargetImage"));
			datas.setBodySourceImage(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].BodySourceImage"));
			datas.setBodyTargetImage(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].BodyTargetImage"));
			datas.setPrefOutTime(_ctx.stringValue("ListPersonDetailsResponse.Data["+ i +"].PrefOutTime"));

			data.add(datas);
		}
		listPersonDetailsResponse.setData(data);
	 
	 	return listPersonDetailsResponse;
	}
}