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

import com.aliyuncs.eds_aic.model.v20230930.AttachKeyPairResponse;
import com.aliyuncs.eds_aic.model.v20230930.AttachKeyPairResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachKeyPairResponseUnmarshaller {

	public static AttachKeyPairResponse unmarshall(AttachKeyPairResponse attachKeyPairResponse, UnmarshallerContext _ctx) {
		
		attachKeyPairResponse.setRequestId(_ctx.stringValue("AttachKeyPairResponse.RequestId"));

		Data data = new Data();
		data.setKeyPairId(_ctx.stringValue("AttachKeyPairResponse.Data.KeyPairId"));
		data.setTotalCount(_ctx.integerValue("AttachKeyPairResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("AttachKeyPairResponse.Data.FailCount"));

		List<String> attachedInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AttachKeyPairResponse.Data.AttachedInstanceIds.Length"); i++) {
			attachedInstanceIds.add(_ctx.stringValue("AttachKeyPairResponse.Data.AttachedInstanceIds["+ i +"]"));
		}
		data.setAttachedInstanceIds(attachedInstanceIds);

		List<String> attachedInstanceGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AttachKeyPairResponse.Data.AttachedInstanceGroupIds.Length"); i++) {
			attachedInstanceGroupIds.add(_ctx.stringValue("AttachKeyPairResponse.Data.AttachedInstanceGroupIds["+ i +"]"));
		}
		data.setAttachedInstanceGroupIds(attachedInstanceGroupIds);
		attachKeyPairResponse.setData(data);
	 
	 	return attachKeyPairResponse;
	}
}