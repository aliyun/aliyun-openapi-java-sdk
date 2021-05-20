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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListAlgorithmNamesByDeviceIdsResponse;
import com.aliyuncs.vcs.model.v20200515.ListAlgorithmNamesByDeviceIdsResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlgorithmNamesByDeviceIdsResponseUnmarshaller {

	public static ListAlgorithmNamesByDeviceIdsResponse unmarshall(ListAlgorithmNamesByDeviceIdsResponse listAlgorithmNamesByDeviceIdsResponse, UnmarshallerContext _ctx) {
		
		listAlgorithmNamesByDeviceIdsResponse.setRequestId(_ctx.stringValue("ListAlgorithmNamesByDeviceIdsResponse.RequestId"));
		listAlgorithmNamesByDeviceIdsResponse.setMessage(_ctx.stringValue("ListAlgorithmNamesByDeviceIdsResponse.Message"));
		listAlgorithmNamesByDeviceIdsResponse.setCode(_ctx.stringValue("ListAlgorithmNamesByDeviceIdsResponse.Code"));
		listAlgorithmNamesByDeviceIdsResponse.setSuccess(_ctx.booleanValue("ListAlgorithmNamesByDeviceIdsResponse.Success"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListAlgorithmNamesByDeviceIdsResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setGbId(_ctx.stringValue("ListAlgorithmNamesByDeviceIdsResponse.Data["+ i +"].GbId"));

			List<String> algorithmNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAlgorithmNamesByDeviceIdsResponse.Data["+ i +"].AlgorithmNames.Length"); j++) {
				algorithmNames.add(_ctx.stringValue("ListAlgorithmNamesByDeviceIdsResponse.Data["+ i +"].AlgorithmNames["+ j +"]"));
			}
			items.setAlgorithmNames(algorithmNames);

			data.add(items);
		}
		listAlgorithmNamesByDeviceIdsResponse.setData(data);
	 
	 	return listAlgorithmNamesByDeviceIdsResponse;
	}
}