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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchAdvertisingRequest extends RpcAcsRequest<SearchAdvertisingResponse> {
	   

	@SerializedName("app")
	private App app;

	@SerializedName("ext")
	private Map<String,String> ext;

	private Integer test;

	@SerializedName("imp")
	private List<Imp> imp;

	private String id;

	@SerializedName("user")
	private User user;

	@SerializedName("device")
	private Device device;
	public SearchAdvertisingRequest() {
		super("UniMkt", "2018-12-12", "SearchAdvertising");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public App getApp() {
		return this.app;
	}

	public void setApp(App app) {
		this.app = app;	
		if (app != null) {
			putQueryParameter("App" , new Gson().toJson(app));
		}	
	}

	public Map<String,String> getExt() {
		return this.ext;
	}

	public void setExt(Map<String,String> ext) {
		this.ext = ext;	
		if (ext != null) {
			putQueryParameter("Ext" , new Gson().toJson(ext));
		}	
	}

	public Integer getTest() {
		return this.test;
	}

	public void setTest(Integer test) {
		this.test = test;
		if(test != null){
			putQueryParameter("Test", test.toString());
		}
	}

	public List<Imp> getImp() {
		return this.imp;
	}

	public void setImp(List<Imp> imp) {
		this.imp = imp;	
		if (imp != null) {
			putQueryParameter("Imp" , new Gson().toJson(imp));
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;	
		if (user != null) {
			putQueryParameter("User" , new Gson().toJson(user));
		}	
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;	
		if (device != null) {
			putQueryParameter("Device" , new Gson().toJson(device));
		}	
	}

	public static class App {

		@SerializedName("Ext")
		private Map<String,String> ext;

		@SerializedName("Sn")
		private String sn;

		@SerializedName("Mediaid")
		private String mediaid;

		public Map<String,String> getExt() {
			return this.ext;
		}

		public void setExt(Map<String,String> ext) {
			this.ext = ext;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getMediaid() {
			return this.mediaid;
		}

		public void setMediaid(String mediaid) {
			this.mediaid = mediaid;
		}
	}

	public static class Imp {

		@SerializedName("Tagid")
		private String tagid;

		@SerializedName("Id")
		private String id;

		public String getTagid() {
			return this.tagid;
		}

		public void setTagid(String tagid) {
			this.tagid = tagid;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class User {

		@SerializedName("Uid")
		private String uid;

		@SerializedName("Uidtype")
		private String uidtype;

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getUidtype() {
			return this.uidtype;
		}

		public void setUidtype(String uidtype) {
			this.uidtype = uidtype;
		}
	}

	public static class Device {

		@SerializedName("Os")
		private String os;

		@SerializedName("Utdid")
		private String utdid;

		@SerializedName("Ip")
		private String ip;

		@SerializedName("Idfa")
		private String idfa;

		@SerializedName("Language")
		private String language;

		@SerializedName("Macmd5")
		private String macmd5;

		@SerializedName("Ua")
		private String ua;

		@SerializedName("Devicetype")
		private Integer devicetype;

		@SerializedName("Mac")
		private String mac;

		@SerializedName("Geo")
		private Geo geo;

		@SerializedName("Carrier")
		private String carrier;

		@SerializedName("Osv")
		private String osv;

		@SerializedName("Androidmd5")
		private String androidmd5;

		@SerializedName("Caid")
		private String caid;

		@SerializedName("Imei")
		private String imei;

		@SerializedName("Imeimd5")
		private String imeimd5;

		@SerializedName("Model")
		private String model;

		@SerializedName("Connectiontype")
		private Integer connectiontype;

		@SerializedName("Make")
		private String make;

		@SerializedName("Oaid")
		private String oaid;

		@SerializedName("Androidid")
		private String androidid;

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getUtdid() {
			return this.utdid;
		}

		public void setUtdid(String utdid) {
			this.utdid = utdid;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getIdfa() {
			return this.idfa;
		}

		public void setIdfa(String idfa) {
			this.idfa = idfa;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getMacmd5() {
			return this.macmd5;
		}

		public void setMacmd5(String macmd5) {
			this.macmd5 = macmd5;
		}

		public String getUa() {
			return this.ua;
		}

		public void setUa(String ua) {
			this.ua = ua;
		}

		public Integer getDevicetype() {
			return this.devicetype;
		}

		public void setDevicetype(Integer devicetype) {
			this.devicetype = devicetype;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public Geo getGeo() {
			return this.geo;
		}

		public void setGeo(Geo geo) {
			this.geo = geo;
		}

		public String getCarrier() {
			return this.carrier;
		}

		public void setCarrier(String carrier) {
			this.carrier = carrier;
		}

		public String getOsv() {
			return this.osv;
		}

		public void setOsv(String osv) {
			this.osv = osv;
		}

		public String getAndroidmd5() {
			return this.androidmd5;
		}

		public void setAndroidmd5(String androidmd5) {
			this.androidmd5 = androidmd5;
		}

		public String getCaid() {
			return this.caid;
		}

		public void setCaid(String caid) {
			this.caid = caid;
		}

		public String getImei() {
			return this.imei;
		}

		public void setImei(String imei) {
			this.imei = imei;
		}

		public String getImeimd5() {
			return this.imeimd5;
		}

		public void setImeimd5(String imeimd5) {
			this.imeimd5 = imeimd5;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Integer getConnectiontype() {
			return this.connectiontype;
		}

		public void setConnectiontype(Integer connectiontype) {
			this.connectiontype = connectiontype;
		}

		public String getMake() {
			return this.make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getOaid() {
			return this.oaid;
		}

		public void setOaid(String oaid) {
			this.oaid = oaid;
		}

		public String getAndroidid() {
			return this.androidid;
		}

		public void setAndroidid(String androidid) {
			this.androidid = androidid;
		}

		public static class Geo {

			@SerializedName("Province")
			private String province;

			@SerializedName("City")
			private String city;

			@SerializedName("District")
			private String district;

			@SerializedName("Lon")
			private Double lon;

			@SerializedName("Lat")
			private Double lat;

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getDistrict() {
				return this.district;
			}

			public void setDistrict(String district) {
				this.district = district;
			}

			public Double getLon() {
				return this.lon;
			}

			public void setLon(Double lon) {
				this.lon = lon;
			}

			public Double getLat() {
				return this.lat;
			}

			public void setLat(Double lat) {
				this.lat = lat;
			}
		}
	}

	@Override
	public Class<SearchAdvertisingResponse> getResponseClass() {
		return SearchAdvertisingResponse.class;
	}

}
