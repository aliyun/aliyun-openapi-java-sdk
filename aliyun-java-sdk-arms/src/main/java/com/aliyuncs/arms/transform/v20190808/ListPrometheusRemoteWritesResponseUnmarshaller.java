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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListPrometheusRemoteWritesResponse;
import com.aliyuncs.arms.model.v20190808.ListPrometheusRemoteWritesResponse.RemoteWrite;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrometheusRemoteWritesResponseUnmarshaller {

	public static ListPrometheusRemoteWritesResponse unmarshall(ListPrometheusRemoteWritesResponse listPrometheusRemoteWritesResponse, UnmarshallerContext _ctx) {
		
		listPrometheusRemoteWritesResponse.setRequestId(_ctx.stringValue("ListPrometheusRemoteWritesResponse.RequestId"));
		listPrometheusRemoteWritesResponse.setSuccess(_ctx.booleanValue("ListPrometheusRemoteWritesResponse.Success"));
		listPrometheusRemoteWritesResponse.setMessage(_ctx.stringValue("ListPrometheusRemoteWritesResponse.Message"));
		listPrometheusRemoteWritesResponse.setCode(_ctx.integerValue("ListPrometheusRemoteWritesResponse.Code"));

		List<RemoteWrite> data = new ArrayList<RemoteWrite>();
		for (int i = 0; i < _ctx.lengthValue("ListPrometheusRemoteWritesResponse.Data.Length"); i++) {
			RemoteWrite remoteWrite = new RemoteWrite();
			remoteWrite.setClusterId(_ctx.stringValue("ListPrometheusRemoteWritesResponse.Data["+ i +"].ClusterId"));
			remoteWrite.setRemoteWriteName(_ctx.stringValue("ListPrometheusRemoteWritesResponse.Data["+ i +"].RemoteWriteName"));
			remoteWrite.setRemoteWriteYaml(_ctx.stringValue("ListPrometheusRemoteWritesResponse.Data["+ i +"].RemoteWriteYaml"));

			data.add(remoteWrite);
		}
		listPrometheusRemoteWritesResponse.setData(data);
	 
	 	return listPrometheusRemoteWritesResponse;
	}
}