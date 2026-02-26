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

package com.aliyuncs.beian.transform.v20160810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.beian.model.v20160810.ListUnbeianIpCheckTypeResponse;
import com.aliyuncs.beian.model.v20160810.ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO;
import com.aliyuncs.beian.model.v20160810.ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnbeianIpCheckTypeResponseUnmarshaller {

	public static ListUnbeianIpCheckTypeResponse unmarshall(ListUnbeianIpCheckTypeResponse listUnbeianIpCheckTypeResponse, UnmarshallerContext _ctx) {
		
		listUnbeianIpCheckTypeResponse.setRequestId(_ctx.stringValue("ListUnbeianIpCheckTypeResponse.RequestId"));
		listUnbeianIpCheckTypeResponse.setErrorMessage(_ctx.stringValue("ListUnbeianIpCheckTypeResponse.ErrorMessage"));
		listUnbeianIpCheckTypeResponse.setSuccess(_ctx.booleanValue("ListUnbeianIpCheckTypeResponse.Success"));
		listUnbeianIpCheckTypeResponse.setErrorCode(_ctx.integerValue("ListUnbeianIpCheckTypeResponse.ErrorCode"));

		HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO = new HuntressIpCheckTypeResultDO();
		huntressIpCheckTypeResultDO.setMsg(_ctx.stringValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.Msg"));
		huntressIpCheckTypeResultDO.setSuccess(_ctx.booleanValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.Success"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setIp(_ctx.stringValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.List["+ i +"].Ip"));
			listItem.setAliuid(_ctx.longValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.List["+ i +"].Aliuid"));
			listItem.setCheckType(_ctx.integerValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.List["+ i +"].CheckType"));
			listItem.setCaller(_ctx.stringValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.List["+ i +"].Caller"));
			listItem.setRemark(_ctx.stringValue("ListUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.List["+ i +"].Remark"));

			list.add(listItem);
		}
		huntressIpCheckTypeResultDO.setList(list);
		listUnbeianIpCheckTypeResponse.setHuntressIpCheckTypeResultDO(huntressIpCheckTypeResultDO);
	 
	 	return listUnbeianIpCheckTypeResponse;
	}
}