/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ons.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20160503.OnsClusterListResponse;
import com.aliyuncs.ons.model.v20160503.OnsClusterListResponse.ClusterInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsClusterListResponseUnmarshaller {

	public static OnsClusterListResponse unmarshall(OnsClusterListResponse onsClusterListResponse, UnmarshallerContext context) {
		
		onsClusterListResponse.setRequestId(context.stringValue("OnsClusterListResponse.RequestId"));
		onsClusterListResponse.setHelpUrl(context.stringValue("OnsClusterListResponse.HelpUrl"));

		List<ClusterInfoDo> data = new ArrayList<ClusterInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsClusterListResponse.Data.Length"); i++) {
			ClusterInfoDo clusterInfoDo = new ClusterInfoDo();
			clusterInfoDo.setClusterName(context.stringValue("OnsClusterListResponse.Data["+ i +"].ClusterName"));
			clusterInfoDo.setShare(context.booleanValue("OnsClusterListResponse.Data["+ i +"].Share"));

			data.add(clusterInfoDo);
		}
		onsClusterListResponse.setData(data);
	 
	 	return onsClusterListResponse;
	}
}