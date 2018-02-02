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
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListPreferredEcsTypesResponse;
import com.aliyuncs.ehpc.model.v20170714.ListPreferredEcsTypesResponse.SeriesInfo;
import com.aliyuncs.ehpc.model.v20170714.ListPreferredEcsTypesResponse.SeriesInfo.Roles;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPreferredEcsTypesResponseUnmarshaller {

	public static ListPreferredEcsTypesResponse unmarshall(ListPreferredEcsTypesResponse listPreferredEcsTypesResponse, UnmarshallerContext context) {
		
		listPreferredEcsTypesResponse.setRequestId(context.stringValue("ListPreferredEcsTypesResponse.RequestId"));

		List<SeriesInfo> series = new ArrayList<SeriesInfo>();
		for (int i = 0; i < context.lengthValue("ListPreferredEcsTypesResponse.Series.Length"); i++) {
			SeriesInfo seriesInfo = new SeriesInfo();
			seriesInfo.setSeriesId(context.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].SeriesId"));
			seriesInfo.setSeriesName(context.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].SeriesName"));

			Roles roles = new Roles();

			List<String> manager = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Manager.Length"); j++) {
				manager.add(context.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Manager["+ j +"]"));
			}
			roles.setManager(manager);

			List<String> compute = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Compute.Length"); j++) {
				compute.add(context.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Compute["+ j +"]"));
			}
			roles.setCompute(compute);

			List<String> login = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Login.Length"); j++) {
				login.add(context.stringValue("ListPreferredEcsTypesResponse.Series["+ i +"].Roles.Login["+ j +"]"));
			}
			roles.setLogin(login);
			seriesInfo.setRoles(roles);

			series.add(seriesInfo);
		}
		listPreferredEcsTypesResponse.setSeries(series);
	 
	 	return listPreferredEcsTypesResponse;
	}
}