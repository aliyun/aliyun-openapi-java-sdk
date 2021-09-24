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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListZnodeChildrenResponse;
import com.aliyuncs.mse.model.v20190531.ListZnodeChildrenResponse.ZnodeModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListZnodeChildrenResponseUnmarshaller {

	public static ListZnodeChildrenResponse unmarshall(ListZnodeChildrenResponse listZnodeChildrenResponse, UnmarshallerContext _ctx) {
		
		listZnodeChildrenResponse.setRequestId(_ctx.stringValue("ListZnodeChildrenResponse.RequestId"));
		listZnodeChildrenResponse.setMessage(_ctx.stringValue("ListZnodeChildrenResponse.Message"));
		listZnodeChildrenResponse.setErrorCode(_ctx.stringValue("ListZnodeChildrenResponse.ErrorCode"));
		listZnodeChildrenResponse.setSuccess(_ctx.booleanValue("ListZnodeChildrenResponse.Success"));

		List<ZnodeModel> data = new ArrayList<ZnodeModel>();
		for (int i = 0; i < _ctx.lengthValue("ListZnodeChildrenResponse.Data.Length"); i++) {
			ZnodeModel znodeModel = new ZnodeModel();
			znodeModel.setData(_ctx.stringValue("ListZnodeChildrenResponse.Data["+ i +"].Data"));
			znodeModel.setPath(_ctx.stringValue("ListZnodeChildrenResponse.Data["+ i +"].Path"));
			znodeModel.setDir(_ctx.booleanValue("ListZnodeChildrenResponse.Data["+ i +"].Dir"));
			znodeModel.setName(_ctx.stringValue("ListZnodeChildrenResponse.Data["+ i +"].Name"));

			data.add(znodeModel);
		}
		listZnodeChildrenResponse.setData(data);
	 
	 	return listZnodeChildrenResponse;
	}
}