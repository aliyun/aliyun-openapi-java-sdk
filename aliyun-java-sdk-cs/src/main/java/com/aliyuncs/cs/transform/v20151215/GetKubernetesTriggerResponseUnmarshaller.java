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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.GetKubernetesTriggerResponse;
import com.aliyuncs.cs.model.v20151215.GetKubernetesTriggerResponse.TriggersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKubernetesTriggerResponseUnmarshaller {

	public static GetKubernetesTriggerResponse unmarshall(GetKubernetesTriggerResponse getKubernetesTriggerResponse, UnmarshallerContext _ctx) {
		

		List<TriggersItem> triggers = new ArrayList<TriggersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetKubernetesTriggerResponse.triggers.Length"); i++) {
			TriggersItem triggersItem = new TriggersItem();
			triggersItem.setCluster_id(_ctx.stringValue("GetKubernetesTriggerResponse.triggers["+ i +"].cluster_id"));
			triggersItem.setProject_id(_ctx.stringValue("GetKubernetesTriggerResponse.triggers["+ i +"].project_id"));
			triggersItem.setAction(_ctx.stringValue("GetKubernetesTriggerResponse.triggers["+ i +"].action"));
			triggersItem.setId(_ctx.stringValue("GetKubernetesTriggerResponse.triggers["+ i +"].id"));
			triggersItem.setToken(_ctx.stringValue("GetKubernetesTriggerResponse.triggers["+ i +"].token"));

			triggers.add(triggersItem);
		}
		getKubernetesTriggerResponse.setTriggers(triggers);
	 
	 	return getKubernetesTriggerResponse;
	}
}