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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DetachKeyPairResponse;
import com.aliyuncs.eds_aic.model.v20230930.DetachKeyPairResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachKeyPairResponseUnmarshaller {

	public static DetachKeyPairResponse unmarshall(DetachKeyPairResponse detachKeyPairResponse, UnmarshallerContext _ctx) {
		
		detachKeyPairResponse.setRequestId(_ctx.stringValue("DetachKeyPairResponse.RequestId"));

		Data data = new Data();
		data.setKeyPairId(_ctx.stringValue("DetachKeyPairResponse.Data.KeyPairId"));
		data.setTotalCount(_ctx.integerValue("DetachKeyPairResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("DetachKeyPairResponse.Data.FailCount"));

		List<String> detachedInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DetachKeyPairResponse.Data.DetachedInstanceIds.Length"); i++) {
			detachedInstanceIds.add(_ctx.stringValue("DetachKeyPairResponse.Data.DetachedInstanceIds["+ i +"]"));
		}
		data.setDetachedInstanceIds(detachedInstanceIds);

		List<String> detachedInstanceGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DetachKeyPairResponse.Data.DetachedInstanceGroupIds.Length"); i++) {
			detachedInstanceGroupIds.add(_ctx.stringValue("DetachKeyPairResponse.Data.DetachedInstanceGroupIds["+ i +"]"));
		}
		data.setDetachedInstanceGroupIds(detachedInstanceGroupIds);
		detachKeyPairResponse.setData(data);
	 
	 	return detachKeyPairResponse;
	}
}