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

package com.aliyuncs.eas.transform.v20171023;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20171023.ListStressResponse;
import com.aliyuncs.eas.model.v20171023.ListStressResponse.Stress;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStressResponseUnmarshaller {

	public static ListStressResponse unmarshall(ListStressResponse listStressResponse, UnmarshallerContext _ctx) {
		
		listStressResponse.setRequestId(_ctx.stringValue("ListStressResponse.RequestId"));
		listStressResponse.setCode(_ctx.longValue("ListStressResponse.Code"));

		List<Stress> stresses = new ArrayList<Stress>();
		for (int i = 0; i < _ctx.lengthValue("ListStressResponse.Stresses.Length"); i++) {
			Stress stress = new Stress();
			stress.setServiceName(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].ServiceName"));
			stress.setStressName(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].StressName"));
			stress.setRegion(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].Region"));
			stress.setAvailableAgent(_ctx.longValue("ListStressResponse.Stresses["+ i +"].AvailableAgent"));
			stress.setStatus(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].Status"));
			stress.setMessage(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].Message"));
			stress.setCreateTime(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].CreateTime"));
			stress.setUpdateTime(_ctx.stringValue("ListStressResponse.Stresses["+ i +"].UpdateTime"));

			stresses.add(stress);
		}
		listStressResponse.setStresses(stresses);
	 
	 	return listStressResponse;
	}
}