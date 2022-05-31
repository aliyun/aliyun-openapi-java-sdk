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

package com.aliyuncs.amptest.model.v20201230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class HuichengTestGrayRequest extends RpcAcsRequest<HuichengTestGrayResponse> {
	   

	@SerializedName("home")
	private Home home;
	public HuichengTestGrayRequest() {
		super("AmpTest", "2020-12-30", "HuichengTestGray", "AmpTest");
		setMethod(MethodType.POST);
	}

	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;	
		if (home != null) {
			putQueryParameter("Home" , new Gson().toJson(home));
		}	
	}

	public static class Home {

		@SerializedName("Address")
		private Address address;

		@SerializedName("T")
		private T t;

		@SerializedName("PhoneNumbers")
		private List<String> phoneNumbers;

		@SerializedName("DMap")
		private Map<String,DMapItem> dMap;

		@SerializedName("NameToAge")
		private Map<String,Integer> nameToAge;

		@SerializedName("Locations")
		private List<LocationsItem> locations;

		public Address getAddress() {
			return this.address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public T getT() {
			return this.t;
		}

		public void setT(T t) {
			this.t = t;
		}

		public List<String> getPhoneNumbers() {
			return this.phoneNumbers;
		}

		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}

		public Map<String,DMapItem> getDMap() {
			return this.dMap;
		}

		public void setDMap(Map<String,DMapItem> dMap) {
			this.dMap = dMap;
		}

		public Map<String,Integer> getNameToAge() {
			return this.nameToAge;
		}

		public void setNameToAge(Map<String,Integer> nameToAge) {
			this.nameToAge = nameToAge;
		}

		public List<LocationsItem> getLocations() {
			return this.locations;
		}

		public void setLocations(List<LocationsItem> locations) {
			this.locations = locations;
		}

		public static class Address {

			@SerializedName("T")
			private T t;

			@SerializedName("Location")
			private Location location;

			@SerializedName("Detail")
			private String detail;

			public T getT() {
				return this.t;
			}

			public void setT(T t) {
				this.t = t;
			}

			public Location getLocation() {
				return this.location;
			}

			public void setLocation(Location location) {
				this.location = location;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public static class T {

				@SerializedName("_Class")
				private String _class;

				public String get_Class() {
					return this._class;
				}

				public void set_Class(String _class) {
					this._class = _class;
				}
			}

			public static class Location {

				@SerializedName("Late")
				private Long late;

				@SerializedName("Lon")
				private Long lon;

				public Long getLate() {
					return this.late;
				}

				public void setLate(Long late) {
					this.late = late;
				}

				public Long getLon() {
					return this.lon;
				}

				public void setLon(Long lon) {
					this.lon = lon;
				}
			}
		}

		public static class T {

			@SerializedName("_Class")
			private String _class;

			public String get_Class() {
				return this._class;
			}

			public void set_Class(String _class) {
				this._class = _class;
			}
		}

		public static class DMapItem {

			@SerializedName("Location")
			private Location location;

			@SerializedName("Detail")
			private String detail;

			public Location getLocation() {
				return this.location;
			}

			public void setLocation(Location location) {
				this.location = location;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public static class Location {

				@SerializedName("Late")
				private Long late;

				@SerializedName("Lon")
				private Long lon;

				public Long getLate() {
					return this.late;
				}

				public void setLate(Long late) {
					this.late = late;
				}

				public Long getLon() {
					return this.lon;
				}

				public void setLon(Long lon) {
					this.lon = lon;
				}
			}
		}

		public static class LocationsItem {

			@SerializedName("Late")
			private Long late;

			@SerializedName("Lon")
			private Long lon;

			public Long getLate() {
				return this.late;
			}

			public void setLate(Long late) {
				this.late = late;
			}

			public Long getLon() {
				return this.lon;
			}

			public void setLon(Long lon) {
				this.lon = lon;
			}
		}
	}

	@Override
	public Class<HuichengTestGrayResponse> getResponseClass() {
		return HuichengTestGrayResponse.class;
	}

}
