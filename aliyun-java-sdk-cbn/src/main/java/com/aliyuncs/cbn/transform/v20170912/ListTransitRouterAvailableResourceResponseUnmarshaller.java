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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterAvailableResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterAvailableResourceResponseUnmarshaller {

	public static ListTransitRouterAvailableResourceResponse unmarshall(ListTransitRouterAvailableResourceResponse listTransitRouterAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterAvailableResourceResponse.setRequestId(_ctx.stringValue("ListTransitRouterAvailableResourceResponse.RequestId"));
		listTransitRouterAvailableResourceResponse.setSupportMulticast(_ctx.booleanValue("ListTransitRouterAvailableResourceResponse.SupportMulticast"));

		List<String> slaveZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterAvailableResourceResponse.SlaveZones.Length"); i++) {
			slaveZones.add(_ctx.stringValue("ListTransitRouterAvailableResourceResponse.SlaveZones["+ i +"]"));
		}
		listTransitRouterAvailableResourceResponse.setSlaveZones(slaveZones);

		List<String> masterZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterAvailableResourceResponse.MasterZones.Length"); i++) {
			masterZones.add(_ctx.stringValue("ListTransitRouterAvailableResourceResponse.MasterZones["+ i +"]"));
		}
		listTransitRouterAvailableResourceResponse.setMasterZones(masterZones);

		List<String> availableZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterAvailableResourceResponse.AvailableZones.Length"); i++) {
			availableZones.add(_ctx.stringValue("ListTransitRouterAvailableResourceResponse.AvailableZones["+ i +"]"));
		}
		listTransitRouterAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return listTransitRouterAvailableResourceResponse;
	}
}